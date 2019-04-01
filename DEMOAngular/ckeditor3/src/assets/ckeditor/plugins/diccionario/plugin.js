CKEDITOR.plugins.add('diccionario', {
	// Register the icons. They must match command names.
	// The plugin initialization logic goes inside this method.
	init: function (editor) {
		console.log("xxxxxxxxxxxxaasdfasdf");
		CKEDITOR.dialog.add('diccDialog', function (editor) {
			
			var x = document.getElementsByClassName("valoresDiccionario");

			console.log(x);

			var arr2 = [];
			var i=0;
			for (i = 0; i < x.length; i++) {
				var arr = [];
				arr.push(x[i].innerText);
				arr2.push(arr);
			}
			console.log(arr2);
			return {
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
								id: 'country',
								label: 'Selecciona un valor',
								items: arr2,
								style: 'display: inline-block'
								/*	onClick: function() {
										this.valor= this.getValue();
									}	*/
							}
						]
					}],
				onOk: function () {

					var dialog = this;


					var abbr = editor.document.createElement('abbr');
					abbr.setAttribute('title', dialog.getValueOf('tab-basic', 'country'));
					abbr.setText("[" + dialog.getValueOf('tab-basic', 'country') + "] ");


					editor.insertElement(abbr);

				}
			};
		});

		// Define the editor command that inserts a timestamp.
		editor.addCommand('diccionarioDatos', new CKEDITOR.dialogCommand('diccDialog'));

		// Create the toolbar button that executes the above command.
		editor.ui.addButton('Diccionario', {
			label: 'Diccionario de datos',
			command: 'diccionarioDatos',
			toolbar: 'insert',
			icon: '/assets/ckeditor/plugins/diccionario/icons/timestamp.png'

		});
	}
});

