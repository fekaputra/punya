// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.client;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Tree.Resources;

/**
 * Image bundle containing all client images.
 *
 * Note: Images extends Tree.Resources rather than ClientBundle so that
 * the Images can be used with the com.google.gwt.user.client.ui.Tree class.
 *
 */
public interface Images extends Resources {

  /**
   * Android with arms raised for the welcome dialog created by
   * {@link Ode#createWelcomeDialog(boolean)}
   */
  @Source("com/google/appinventor/images/androidGreenSmall.png")
  ImageResource androidGreenSmall();

  /**
   * Close button image for the box widget
   */
  @Source("com/google/appinventor/images/boxClose.png")
  ImageResource boxClose();

  /**
   * Menu button image for the box widget
   */
  @Source("com/google/appinventor/images/boxMenu.png")
  ImageResource boxMenu();

  /**
   * Minimize button image for the box widget
   */
  @Source("com/google/appinventor/images/boxMinimize.png")
  ImageResource boxMinimize();

  /**
   * Restore button image for the box widget
   */
  @Source("com/google/appinventor/images/boxRestore.png")
  ImageResource boxRestore();

  /**
   * Close button image for the tab widget
   */
  @Source("com/google/appinventor/images/close.png")
  ImageResource close();

  /**
   * Phone status bar shown above the form in the visual designer
   */
  @Source("com/google/appinventor/images/phonebar.png")
  ImageResource phonebar();

  /**
   * Designer palette item: question mark for more component information
   */
  @Source("com/google/appinventor/images/help.png")
  ImageResource help();

  /**
   * Designer palette item: accelerometersensor component
   */
  @Source("com/google/appinventor/images/accelerometersensor.png")
  ImageResource accelerometersensor();

  /**
   * Designer palette item: barcode scanner component
   */
  @Source("com/google/appinventor/images/barcodeScanner.png")
  ImageResource barcodeScanner();

  /**
   * Designer palette item: button component
   */
  @Source("com/google/appinventor/images/button.png")
  ImageResource button();

  /**
   * Designer palette item: camera declaration
   */
  @Source("com/google/appinventor/images/camera.png")
  ImageResource camera();
  
  /**
   * Designer palette item: camcorder declaration
   */
  @Source("com/google/appinventor/images/camcorder.png")
  ImageResource camcorder();

  /**
   * Designer palette item: canvas component
   */
  @Source("com/google/appinventor/images/canvas.png")
  ImageResource canvas();

  /**
   * Designer palette item: checkbox component
   */
  @Source("com/google/appinventor/images/checkbox.png")
  ImageResource checkbox();

  /**
   * Designer palette item: form component
   */
  @Source("com/google/appinventor/images/form.png")
  ImageResource form();

  /**
   * Designer palette item: horizontal arrangement component
   */
  @Source("com/google/appinventor/images/horizontal.png")
  ImageResource horizontal();

  /**
   * Designer palette item: image component
   * Also used for image file icon for project explorer
   */
  @Source("com/google/appinventor/images/image.png")
  ImageResource image();

  /**
   * Designer palette item: label component
   */
  @Source("com/google/appinventor/images/label.png")
  ImageResource label();

  /**
   * Designer palette item: listbox component
   */
  @Source("com/google/appinventor/images/listbox.png")
  ImageResource listbox();

  /**
   * Designer palette item: orientationsensor component
   */
  @Source("com/google/appinventor/images/orientationsensor.png")
  ImageResource orientationsensor();

  /**
   * Designer palette item: proximitysensor component
   */
  @Source("com/google/appinventor/images/proximity.png")
  ImageResource proximitysensor();
  
  /**
   * Designer palette item: socialProximitysensor component
   */
  @Source("com/google/appinventor/images/socialProximitysensor.png")
  ImageResource socialProximitysensor();
  
  /**
   * Designer palette item: Timer component
   */
  @Source("com/google/appinventor/images/timer.png")
  ImageResource timer();
  
  /**
   * Designer palette item: WifiSensor component
   */
  @Source("com/google/appinventor/images/wifiProbe.png")
  ImageResource wifiSensor();
  
  /**
   * Designer palette item: LocationProbe component
   */
  @Source("com/google/appinventor/images/locationProbe.png")
  ImageResource locationProbeSensor();
  
  /**
   * Designer palette item: ActivityProbeSensor component 
   */
  @Source("com/google/appinventor/images/activityProbe.png")
  ImageResource activityProbeSensor();
  
  /**
   * Designer palette item: CellTowerProbeSensor component
   */
  @Source("com/google/appinventor/images/cellTowerProbe.png")
  ImageResource cellTowerProbeSensor();
  
  /**
   * Designer palette item: RunningApplications component
   */
  @Source("com/google/appinventor/images/runningAppsProbe.png")
  ImageResource runningApps();
  
  /**
   * Designer palette item: ScreenStatus component
   */
  @Source("com/google/appinventor/images/screenProbe.png")
  ImageResource screenStatus();
  
  /**
   * Designer palette item: LightSensor component
   */
  @Source("com/google/appinventor/images/lightsensorProbe.png")
  ImageResource lightSensor();
  
  /**
   * Designer palette item: CallLogHistory component
   */
  @Source("com/google/appinventor/images/calllogProbe.png")
  ImageResource calllogHistory();
  
  /**
   * Designer palette item: SmsHistory component
   */
  @Source("com/google/appinventor/images/smsProbe.png")
  ImageResource smsHistory();
  
  /**
   * Designer palette item: BatterySensor component
   */
  @Source("com/google/appinventor/images/batterySensor.png")
  ImageResource batterySensor();
  
  /**
   * Designer palette item: PedometerSensor component
   */
  @Source("com/google/appinventor/images/pedometerSensor.png")
  ImageResource pedometerSensor();
  
  
  /**
   * Designer palette item: Survey component
   */
  @Source("com/google/appinventor/images/survey.png")
  ImageResource survey();
  
  
  /**
   * Designer item: Survey component in designer
   */

  @Source("com/google/appinventor/images/surveybig.png")
  ImageResource surveybig();
  
  /**
   * Designer palette item: Linked Data Chart component
   */
  @Source("com/google/appinventor/images/chart.png")
  ImageResource ldchart();
  
  /**
   * Designer item: Linked Data Chart component in designer
   * 
   */
  @Source("com/google/appinventor/images/chartbig.png")
  ImageResource ldchartbig();

  /**
   * Designer palette item: Google Map component
   */
    @Source("com/google/appinventor/images/gmap.png")
  ImageResource googlemap();

  /**
   * Designer item: GoogleMap component in designer
   *
   */
  @Source("com/google/appinventor/images/gmapBig.png")
  ImageResource googleMapBig();


  /**
   * Designer item: Dropbox component in designer
   * 
   */
  @Source("com/google/appinventor/images/dropbox.png")
  ImageResource dropbox();
  
  /**
   * Designer item: Dropbox component in designer
   * 
   */
  @Source("com/google/appinventor/images/googledrive.png")
  ImageResource googledrive();
  
  /**
   * Designer palette item: player component
   */
  @Source("com/google/appinventor/images/player.png")
  ImageResource player();

  /**
   * Designer palette item: sound recorder component
   */
  @Source("com/google/appinventor/images/soundRecorder.png")
  ImageResource soundRecorder();

  /**
   * Designer palette item: VideoPlayer component
   */
  @Source("com/google/appinventor/images/videoPlayer.png")
  ImageResource videoplayer();

  /**
   * Designer palette item: progressbar component
   */
  @Source("com/google/appinventor/images/progressbar.png")
  ImageResource progressbar();

  /**
   * Designer palette item: radiobutton component
   */
  @Source("com/google/appinventor/images/radiobutton.png")
  ImageResource radiobutton();

  /**
   * Designer palette item: textbox component
   */
  @Source("com/google/appinventor/images/textbox.png")
  ImageResource textbox();

  /**
   * Designer palette item: PasswordTextBox component.
   */
  @Source("com/google/appinventor/images/passwordtextbox.png")
  ImageResource passwordtextbox();

  /**
   * Designer palette item: clock component
   */
  @Source("com/google/appinventor/images/clock.png")
  ImageResource clock();

  /**
   * Designer palette item: SoundEffect component
   */
  @Source("com/google/appinventor/images/soundEffect.png")
  ImageResource soundeffect();

  /**
   * Designer palette item: ContactPicker component
   */
  @Source("com/google/appinventor/images/contactPicker.png")
  ImageResource contactpicker();

  /**
   * Designer palette item: PhoneNumberPicker component
   */
  @Source("com/google/appinventor/images/phoneNumberPicker.png")
  ImageResource phonenumberpicker();

  /**
   * Designer palette item: ImagePicker component
   */
  @Source("com/google/appinventor/images/imagePicker.png")
  ImageResource imagepicker();

  /**
   * Designer palette item: ListPicker component
   */
  @Source("com/google/appinventor/images/listPicker.png")
  ImageResource listpicker();

  /**
   * Designer palette item: PhoneCall component
   */
  @Source("com/google/appinventor/images/phoneCall.png")
  ImageResource phonecall();

  /**
   * Designer palette item: ActivityStarter component
   */
  @Source("com/google/appinventor/images/activityStarter.png")
  ImageResource activitystarter();

  /**
   * Designer palette item: EmailPicker component
   */
  @Source("com/google/appinventor/images/emailPicker.png")
  ImageResource emailpicker();

  /**
   * Designer palette item: Texting component
   */
  @Source("com/google/appinventor/images/texting.png")
  ImageResource texting();

  /**
   * Designer palette item: GameClient component
   */
  @Source("com/google/appinventor/images/gameClient.png")
  ImageResource gameclient();

  /**
   * Designer palette item: Sprite
   */
  @Source("com/google/appinventor/images/imageSprite.png")
  ImageResource imageSprite();

  /**
   * Designer palette item: Ball
   */
  @Source("com/google/appinventor/images/ball.png")
  ImageResource ball();

  /**
   * Designer palette item: Notifier
   */
  @Source("com/google/appinventor/images/notifier.png")
  ImageResource notifier();

  /**
   * Designer palette item: LocationSensor
   */
  @Source("com/google/appinventor/images/locationSensor.png")
  ImageResource locationSensor();

  /**
   * Designer palette item: SpeechRecognizer component
   */
  @Source("com/google/appinventor/images/speechRecognizer.png")
  ImageResource speechRecognizer();

  /**
   * Designer palette item: table arrangement component
   */
  @Source("com/google/appinventor/images/table.png")
  ImageResource table();

  /**
   * Designer palette item: Twitter Component
   */
  @Source("com/google/appinventor/images/twitter.png")
  ImageResource twitterComponent();

  /**
   * Designer palette item: TinyDB Component
   */
  @Source("com/google/appinventor/images/tinyDB.png")
  ImageResource tinyDB();

  /**
   * Designer palette item: TinyWebDB Component
   */
  @Source("com/google/appinventor/images/tinyWebDB.png")
  ImageResource tinyWebDB();

  /**
   * Designer palette item: TextToSpeech component
   */
  @Source("com/google/appinventor/images/textToSpeech.png")
  ImageResource textToSpeech();

  /**
   * Designer palette item: vertical arrangement component
   */
  @Source("com/google/appinventor/images/vertical.png")
  ImageResource vertical();

  /**
   * Designer palette item: VotingComponent
   */
  @Source("com/google/appinventor/images/voting.png")
  ImageResource voting();

  /**
   * Designer palette item: Pedometer Component
   */
  @Source("com/google/appinventor/images/pedometer.png")
  ImageResource pedometerComponent();
  
  /**
   * Designer pallete item: PhoneStatus Component
   */
  @Source("com/google/appinventor/images/phoneip.png")
  ImageResource phonestatusComponent();
  /**
   * Designer palette item: TelephonyInfo Component
   */
  @Source("com/google/appinventor/images/info.png")
  ImageResource telephonyInfo();
  

  /**
   * Designer palette item: Lego Mindstorms NXT components
   */
  @Source("com/google/appinventor/images/legoMindstormsNxt.png")
  ImageResource legoMindstormsNxt();

  /**
   * Designer palette item: Bluetooth components
   */
  @Source("com/google/appinventor/images/bluetooth.png")
  ImageResource bluetooth();

  /**
   * Designer palette item: FusiontablesControl component
   */
  @Source("com/google/appinventor/images/fusiontables.png")
  ImageResource fusiontables();

  /**
   * Designer palette item: WebViewer component
   */
  @Source("com/google/appinventor/images/webviewer.png")
  ImageResource webviewer();

  /**
   * Designer item: WebViewer component in designer
   */
  // The image here is public domain and comes from
  // www.pdclipart.org/displayimage.php/?pid=1047
  @Source("com/google/appinventor/images/webviewerbig.png")
  ImageResource webviewerbig();

  /**
   * Designer palette item: Web component
   */
  @Source("com/google/appinventor/images/web.png")
  ImageResource web();

  /**
   * Designer palette item: Semantic Web Component
   */
  @Source("com/google/appinventor/images/semanticWeb.png")
  ImageResource semanticWeb();

  /**
   * Designer palette item: Semantic Forms Layout
   */
  @Source("com/google/appinventor/images/semanticForm.png")
  ImageResource semanticForm();
}
