CKEDITOR.plugins.add('diccionario', {
	// Register the icons. They must match command names.

	// The plugin initialization logic goes inside this method.
	init: function (editor) {
		CKEDITOR.dialog.add('diccDialog', function (editor) {
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
								label: 'Which country is bigger',
								items: [['France', 'France'], ['Germany', 'Germany'], ['England', 'England']],
								style:'display: inline-block'
							/*	onClick: function() {
									this.valor= this.getValue();
								}	*/
							}
						]
					}],
						onOk: function () {
							
						var dialog = this;
						//console.log(dialog.getValueOf( 'tab-basic', 'country' ) );


								var abbr = editor.document.createElement('abbr');
							abbr.setAttribute('title',dialog.getValueOf( 'tab-basic', 'country' ));
							abbr.setText("["+dialog.getValueOf( 'tab-basic', 'country' ) + "] ");
								
				
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
