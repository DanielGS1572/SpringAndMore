CKEDITOR.plugins.add('diccionario', {

	init: function (editor) {

		CKEDITOR.dialog.add('diccDialog', function (editor) {

			var x;
			var arr2;
			x = document.getElementsByClassName("valoresDiccionario");
			arr2 = [];
			var i = 0;
			for (i = 0; i < x.length; i++) {
				var arr = [];
				arr.push(x[i].innerText);
				arr2.push(arr);
			}
			console.log(arr2, "arr2");


			return {

				onShow: function () {
					//	setCampos();
					console.log(this.getContentElement('tab-basic','diccionario'),"getElementContent");
						
					console.log(this.getContentElement('tab-basic','diccionario').items.createElement);
					this.getContentElement('tab-basic','diccionario').items.forEach(element => {
						element.pop();
					});
//					select.add(["e"]);
					console.log(CKEDITOR.currentInstance.name);
					if (arr2.length === 0) {
						alert("seleccionar un diccionario");
						CKEDITOR.dialog.getCurrent().hide();
					}
			



				},


				title: 'Diccionario de datos',
				minWidth: 400,
				minHeight: 200,
				valor: null,
				contents: [
					{
						id: 'tab-basic',
						label: 'Basic Settings',
						elements: [
							{
								type: 'radio',
								id: 'diccionario',
								label: 'Selecciona un valor',
								items: arr2,
								style: 'display: inline-block',

							}
						]
					}],


				onOk: function () {

					var dialog = this;


					var abbr = editor.document.createElement('abbr');
					abbr.setAttribute('title', dialog.getValueOf('tab-basic', 'diccionario'));
					abbr.setText("[" + dialog.getValueOf('tab-basic', 'diccionario') + "] ");


					editor.insertElement(abbr);

				}

			};
		});

		editor.addCommand('diccionarioDatos', new CKEDITOR.dialogCommand('diccDialog'));

		editor.ui.addButton('Diccionario', {
			label: 'Diccionario de datos',
			command: 'diccionarioDatos',
			toolbar: 'insert',
			icon: '/assets/ckeditor/plugins/diccionario/icons/timestamp.png'

		});
	}
});

