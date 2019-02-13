CKEDITOR.plugins.add( 'timestamp', {

	// Register the icons. They must match command names.

	// The plugin initialization logic goes inside this method.
	init: function( editor ) {
			console.log(this.icon);
		// Define the editor command that inserts a timestamp.
		editor.addCommand( 'insertTimestamp', {

			// Define the function that will be fired when the command is executed.
			exec: function( editor ) {
				var texto = 'texto del botón ';

				// Insert the timestamp into the document.
				editor.insertHtml( texto );
			}
		});

		// Create the toolbar button that executes the above command.
		editor.ui.addButton( 'Timestamp', {
			label: 'Insert Timestamp',
			command: 'insertTimestamp',
			toolbar: 'insert',
			icon: '/assets/ckeditor/plugins/timestamp/icons/timestamp.png'

		});
	}
});
