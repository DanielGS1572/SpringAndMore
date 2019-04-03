CKEDITOR.plugins.add('valida', {

	init: function (editor) {
		editor.addCommand('validaContenido', {
			exec: function (editor) {
				var x;
			x = document.getElementsByClassName("valoresDiccionario");
			var diccionario  = [];
			var i = 0;
			for (i = 0; i < x.length; i++) {
				diccionario.push(x[i].innerText);
			}
			console.log(diccionario, "diccionario");
				
				var valoresOk = [];
				var cadena = editor.getData();

				cadena = cadena.split("<span style=\"background-color:yellow!important\">").join("");
				cadena = cadena.split("</span>").join("");
				editor.editable().setHtml(cadena);

				var result = getFromBetween.get(editor.getData(), "[", "]");

				diccionario.forEach(
					(e1) => result.forEach(
						(e2) => {
							if (e1 === e2) {
								valoresOk.push(e1);
							}
						}));
				console.log(valoresOk);
				console.log("valoresOk");

				result = result.filter((el) => !valoresOk.includes(el));
				console.log("valores NO ok");
				console.log(result);

				for (var i = 0; i < result.length; i++) {
					cadena = cadena.replace(result[i], "<span style='background-color:yellow!important'>" + result[i] + "</span>");
				}
				console.log(cadena);
				editor.editable().setHtml(cadena);

			}
		});


		editor.ui.addButton('validaContenido', {
			label: 'Valida contenido',
			command: 'validaContenido',
			toolbar: 'insert',
			icon: '/assets/ckeditor/plugins/valida/icons/timestamp.png'

		});



		var getFromBetween = {
			results: [],
			string: "",
			getFromBetween: function (sub1, sub2) {
				if (this.string.indexOf(sub1) < 0 || this.string.indexOf(sub2) < 0) return false;
				var SP = this.string.indexOf(sub1) + sub1.length;
				var string1 = this.string.substr(0, SP);
				var string2 = this.string.substr(SP);
				var TP = string1.length + string2.indexOf(sub2);
				return this.string.substring(SP, TP);
			},
			removeFromBetween: function (sub1, sub2) {
				if (this.string.indexOf(sub1) < 0 || this.string.indexOf(sub2) < 0) return false;
				var removal = sub1 + this.getFromBetween(sub1, sub2) + sub2;
				this.string = this.string.replace(removal, "");
			},
			getAllResults: function (sub1, sub2) {
				// first check to see if we do have both substrings
				if (this.string.indexOf(sub1) < 0 || this.string.indexOf(sub2) < 0) return;

				// find one result
				var result = this.getFromBetween(sub1, sub2);
				// push it to the results array
				this.results.push(result);
				// remove the most recently found one from the string
				this.removeFromBetween(sub1, sub2);

				// if there's more substrings
				if (this.string.indexOf(sub1) > -1 && this.string.indexOf(sub2) > -1) {
					this.getAllResults(sub1, sub2);
				}
				else return;
			},
			get: function (string, sub1, sub2) {
				this.results = [];
				this.string = string;
				this.getAllResults(sub1, sub2);
				return this.results;
			}
		};
	}
});
