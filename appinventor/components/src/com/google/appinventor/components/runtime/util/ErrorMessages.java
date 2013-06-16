// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.components.runtime.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides constants and methods related to error numbers and messages.
 *
 * @author lizlooney@google.com (Liz Looney)
 */
public final class ErrorMessages {
  // Phone version errors
  public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_CONTACT_EMAIL = 1;
  public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_EMAIL_PICKER = 2;
  public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_FUSIONTABLES_CONTROL = 3;
  public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_WEB_COOKIES = 4;
  // LocationSensor errors
  public static final int ERROR_LOCATION_SENSOR_LATITUDE_NOT_FOUND = 101;
  public static final int ERROR_LOCATION_SENSOR_LONGITUDE_NOT_FOUND = 102;
  // Camera errors
  public static final int ERROR_CAMERA_NO_IMAGE_RETURNED = 201;
  // Twitter errors
  public static final int ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION = 301;
  public static final int ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET = 302;
  public static final int ERROR_TWITTER_EXCEPTION = 303;
  public static final int ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN = 304;
  public static final int ERROR_TWITTER_AUTHORIZATION_FAILED = 305;
  public static final int ERROR_TWITTER_SET_STATUS_FAILED = 306;
  public static final int ERROR_TWITTER_REQUEST_MENTIONS_FAILED = 307;
  public static final int ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED = 308;
  public static final int ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED = 309;
  public static final int ERROR_TWITTER_DIRECT_MESSAGE_FAILED = 310;
  public static final int ERROR_TWITTER_FOLLOW_FAILED = 311;
  public static final int ERROR_TWITTER_STOP_FOLLOWING_FAILED = 312;
  public static final int ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED = 313;
  public static final int ERROR_TWITTER_SEARCH_FAILED = 314;
  // LegoMindstormsNXT errors
  public static final int ERROR_NXT_BLUETOOTH_NOT_SET = 401;
  public static final int ERROR_NXT_NOT_CONNECTED_TO_ROBOT = 402;
  public static final int ERROR_NXT_INVALID_RETURN_PACKAGE = 403;
  public static final int ERROR_NXT_ERROR_CODE_RECEIVED = 404;
  public static final int ERROR_NXT_INVALID_PROGRAM_NAME = 405;
  public static final int ERROR_NXT_INVALID_FILE_NAME = 406;
  public static final int ERROR_NXT_INVALID_MOTOR_PORT = 407;
  public static final int ERROR_NXT_INVALID_SENSOR_PORT = 408;
  public static final int ERROR_NXT_INVALID_MAILBOX = 409;
  public static final int ERROR_NXT_MESSAGE_TOO_LONG = 410;
  public static final int ERROR_NXT_DATA_TOO_LARGE = 411;
  public static final int ERROR_NXT_COULD_NOT_DECODE_ELEMENT = 412;
  public static final int ERROR_NXT_COULD_NOT_FIT_ELEMENT_IN_BYTE = 413;
  public static final int ERROR_NXT_INVALID_SOURCE_ARGUMENT = 414;
  public static final int ERROR_NXT_INVALID_DESTINATION_ARGUMENT = 415;
  public static final int ERROR_NXT_UNABLE_TO_DOWNLOAD_FILE = 416;
  public static final int ERROR_NXT_CANNOT_DETECT_COLOR = 417;
  public static final int ERROR_NXT_CANNOT_DETECT_LIGHT = 418;
  public static final int ERROR_NXT_INVALID_GENERATE_COLOR = 419;
  // Bluetooth errors
  public static final int ERROR_BLUETOOTH_NOT_AVAILABLE = 501;
  public static final int ERROR_BLUETOOTH_NOT_ENABLED = 502;
  public static final int ERROR_BLUETOOTH_INVALID_ADDRESS = 503;
  public static final int ERROR_BLUETOOTH_NOT_PAIRED_DEVICE = 504;
  public static final int ERROR_BLUETOOTH_NOT_REQUIRED_CLASS_OF_DEVICE = 505;
  public static final int ERROR_BLUETOOTH_INVALID_UUID = 506;
  public static final int ERROR_BLUETOOTH_UNABLE_TO_CONNECT = 507;
  public static final int ERROR_BLUETOOTH_UNABLE_TO_LISTEN = 508;
  public static final int ERROR_BLUETOOTH_UNABLE_TO_ACCEPT = 509;
  public static final int ERROR_BLUETOOTH_COULD_NOT_DECODE = 510;
  public static final int ERROR_BLUETOOTH_COULD_NOT_FIT_NUMBER_IN_BYTE = 511;
  public static final int ERROR_BLUETOOTH_COULD_NOT_FIT_NUMBER_IN_BYTES = 512;
  public static final int ERROR_BLUETOOTH_COULD_NOT_DECODE_ELEMENT = 513;
  public static final int ERROR_BLUETOOTH_COULD_NOT_FIT_ELEMENT_IN_BYTE = 514;
  public static final int ERROR_BLUETOOTH_NOT_CONNECTED_TO_DEVICE = 515;
  public static final int ERROR_BLUETOOTH_UNABLE_TO_WRITE = 516;
  public static final int ERROR_BLUETOOTH_UNABLE_TO_READ = 517;
  public static final int ERROR_BLUETOOTH_END_OF_STREAM = 518;
  public static final int ERROR_BLUETOOTH_UNSUPPORTED_ENCODING = 519;
  // ActivityStarter errors
  public static final int ERROR_ACTIVITY_STARTER_NO_CORRESPONDING_ACTIVITY = 601;
  // Media errors
  public static final int ERROR_UNABLE_TO_LOAD_MEDIA = 701;
  public static final int ERROR_UNABLE_TO_PREPARE_MEDIA = 702;
  public static final int ERROR_UNABLE_TO_PLAY_MEDIA = 703;
  public static final int ERROR_MEDIA_EXTERNAL_STORAGE_READONLY = 704;
  public static final int ERROR_MEDIA_EXTERNAL_STORAGE_NOT_AVAILABLE = 705;
  public static final int ERROR_MEDIA_IMAGE_FILE_FORMAT = 706;
  public static final int ERROR_MEDIA_CANNOT_OPEN = 707;
  public static final int ERROR_MEDIA_FILE_ERROR = 708;
  // SoundRecorder errors
  public static final int ERROR_SOUND_RECORDER = 801;
  public static final int ERROR_SOUND_RECORDER_CANNOT_CREATE = 802;
  // Form errors
  public static final int ERROR_INVALID_SCREEN_ORIENTATION = 901;
  public static final int ERROR_SCREEN_NOT_FOUND = 902;
  public static final int ERROR_SCREEN_BAD_VALUE_RECEIVED = 903;
  public static final int ERROR_SCREEN_BAD_VALUE_FOR_SENDING = 904;
  // Canvas errors
  public static final int ERROR_CANVAS_BITMAP_ERROR = 1001;
  // Web errors
  public static final int ERROR_WEB_UNABLE_TO_GET = 1101;
  public static final int ERROR_WEB_UNSUPPORTED_ENCODING = 1102;
  public static final int ERROR_WEB_UNABLE_TO_POST = 1103;
  public static final int ERROR_WEB_UNABLE_TO_POST_FILE = 1104;
  public static final int ERROR_WEB_JSON_TEXT_DECODE_FAILED = 1105;
  public static final int ERROR_WEB_HTML_TEXT_DECODE_FAILED = 1106;
  // There is a gap here because two ContactPicker errors below use the numbers 1107 and 1108.
  public static final int ERROR_WEB_MALFORMED_URL = 1109;
  public static final int ERROR_WEB_REQUEST_HEADER_NOT_LIST = 1110;
  public static final int ERROR_WEB_REQUEST_HEADER_NOT_TWO_ELEMENTS = 1111;
  public static final int ERROR_WEB_BUILD_POST_DATA_NOT_LIST = 1112;
  public static final int ERROR_WEB_BUILD_POST_DATA_NOT_TWO_ELEMENTS = 1113;
  // Contact picker (and PhoneNumberPicker) errors
  public static final int ERROR_PHONE_UNSUPPORTED_CONTACT_PICKER = 1107;
  public static final int ERROR_PHONE_UNSUPPORTED_SEARCH_IN_CONTACT_PICKING = 1108;
  //Camcorder errors
  public static final int ERROR_CAMCORDER_NO_CLIP_RETURNED = 1201;
    
  // VideoPlayer errors
  public static final int ERROR_VIDEOPLAYER_FULLSCREEN_UNAVAILBLE = 1301;
  public static final int ERROR_VIDEOPLAYER_FULLSCREEN_CANT_EXIT = 1302;
  public static final int ERROR_VIDEOPLAYER_FULLSCREEN_UNSUPPORTED = 1303;
  // Arrangement errors
  public static final int ERROR_BAD_VALUE_FOR_HORIZONTAL_ALIGNMENT = 1401;
  public static final int ERROR_BAD_VALUE_FOR_VERTICAL_ALIGNMENT = 1402;
  // BarcodeScanner errors
  public static final int ERROR_NO_SCANNER_FOUND = 1501;
  // ImagePicker errors
  public static final int ERROR_CANNOT_SAVE_IMAGE = 1601;
  public static final int ERROR_CANNOT_COPY_MEDIA = 1602;
  // Texting errors
  public static final int ERROR_BAD_VALUE_FOR_TEXT_RECEIVING = 1701;
  

  public static final int ERROR_DATE_FORMAT = 1801;
  // Dropbox errors 
  public static final int ERROR_DROPBOX_BLANK_APP_KEY_OR_SECRET = 1810;
  public static final int ERROR_DROPBOX_EXCEPTION = 1811;
  public static final int ERROR_DROPBOX_UNLINKED = 1812;
  public static final int ERROR_DROPBOX_FILESIZE = 1813;
  public static final int ERROR_DROPBOX_PARTIALFILE = 1814;
  public static final int ERROR_DROPBOX_SERVER_INSUFFICIENT_STORAGE = 1815;
  public static final int ERROR_DROPBOX_IO = 1816;
  public static final int ERROR_DROPBOX_FILENOTFOUND = 1817;
  public static final int ERROR_DROPBOX_NO_TWO_RUNNING_TASKS = 1818;

  public static final int ERROR_GOOGLEDRIVE_EXCEPTION = 1901;
  public static final int ERROR_GOOGLEDRIVE_IO_EXCEPTION = 1902;
  public static final int ERROR_GOOGLEDRIVE_INVALID_CREDENTIALS = 1903;
  public static final int ERROR_GOOGLEDRIVE_NOT_GRANT_PERMISSION = 1904;
  public static final int ERROR_GOOGLEDRIVE_APP_CONFIG_ERROR = 1905;
  public static final int ERROR_GOOGLEDRIVE_APP_BLACKLIST = 1906;
  public static final int ERROR_GOOGLEDRIVE_HTTP_RESPONSE = 1907;
  
  // Please start the next group of error numbers at 2001.
  public static final int ERROR_SENSORDB_NOTAVAILABLE = 2001;
  public static final int ERROR_SENSORDB_NOTACTIVE = 2002;

  // Please start the next group of error numbers at 2010.
  public static final int ERROR_GOOGLE_MAP_NOT_INSTALLED = 2010;
  public static final int ERROR_GOOGLE_PLAY_NOT_INSTALLED = 2011;
  public static final int ERROR_GOOGLE_MAP_INVALID_INPUT = 2012;
  public static final int ERROR_GOOGLE_MAP_MARKER_NOT_EXIST = 2013;
  public static final int ERROR_GOOGLE_MAP_JSON_FORMAT_DECODE_FAILED = 2014;
  public static final int ERROR_GOOGLE_MAP_CIRCLE_NOT_EXIST = 2015;
  public static final int ERROR_GOOGLE_PLAY_SERVICE_UPDATE_REQUIRED = 2016;
  public static final int ERROR_GOOGLE_PLAY_DISABLED = 2017;
  public static final int ERROR_GOOGLE_PLAY_INVALID = 2018;

  
  // Mapping of error numbers to error message format strings.
  private static final Map<Integer, String> errorMessages;
  static {
    errorMessages = new HashMap<Integer, String>();
    // Phone version errors
    errorMessages.put(ERROR_FUNCTIONALITY_NOT_SUPPORTED_CONTACT_EMAIL,
        "Warning: This app contains functionality that does not work on this phone: " +
        "picking an EmailAddress.");
    errorMessages.put(ERROR_FUNCTIONALITY_NOT_SUPPORTED_EMAIL_PICKER,
        "Warning: This app contains functionality that does not work on this phone: " +
        "the EmailPicker component.");
    errorMessages.put(ERROR_FUNCTIONALITY_NOT_SUPPORTED_FUSIONTABLES_CONTROL,
        "Warning: This app contains functionality that does not work on this phone: " +
        "the FusiontablesControl component.");
    errorMessages.put(ERROR_FUNCTIONALITY_NOT_SUPPORTED_WEB_COOKIES,
        "Warning: This app contains functionality that does not work on this phone: " +
        "using cookies in the Web component.");
    // LocationSensor errors
    errorMessages.put(ERROR_LOCATION_SENSOR_LATITUDE_NOT_FOUND,
        "Unable to find latitude from %s.");
    errorMessages.put(ERROR_LOCATION_SENSOR_LONGITUDE_NOT_FOUND,
        "Unable to find longitude from %s.");
    // Camera errors
    errorMessages.put(ERROR_CAMERA_NO_IMAGE_RETURNED,
        "The camera did not return an image.");
    // Twitter errors
    errorMessages.put(ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION,
        "Twitter no longer supports this form of Login. Use the Authorize call instead.");
    errorMessages.put(ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET,
        "The ConsumerKey and ConsumerSecret properties must be set in order to authorize access " +
        "for Twitter. Please obtain a Comsumer Key and Consumer Secret specific to your app from " +
        "http://twitter.com/oauth_clients/new");
    errorMessages.put(ERROR_TWITTER_EXCEPTION,
        "Twitter error: %s");
    errorMessages.put(ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN,
        "Unable to get access token: %s");
    errorMessages.put(ERROR_TWITTER_AUTHORIZATION_FAILED,
        "Twitter authorization failed");
    errorMessages.put(ERROR_TWITTER_SET_STATUS_FAILED,
        "SetStatus failed. %s");
    errorMessages.put(ERROR_TWITTER_REQUEST_MENTIONS_FAILED,
        "RequestMentions failed. %s");
    errorMessages.put(ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED,
        "RequestFollowers failed. %s");
    errorMessages.put(ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED,
        "RequestDirectMessages failed. %s");
    errorMessages.put(ERROR_TWITTER_DIRECT_MESSAGE_FAILED,
        "DirectMessage failed. %s");
    errorMessages.put(ERROR_TWITTER_FOLLOW_FAILED,
        "Follow failed. %s");
    errorMessages.put(ERROR_TWITTER_STOP_FOLLOWING_FAILED,
        "StopFollowing failed. %s");
    errorMessages.put(ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED,
        "Twitter RequestFriendTimeline failed: %s");
    errorMessages.put(ERROR_TWITTER_SEARCH_FAILED,
        "Twitter search failed.");
    // LegoMindstormsNXT errors
    errorMessages.put(ERROR_NXT_BLUETOOTH_NOT_SET,
        "The Bluetooth property has not been set.");
    errorMessages.put(ERROR_NXT_NOT_CONNECTED_TO_ROBOT,
        "Not connected to a robot.");
    errorMessages.put(ERROR_NXT_INVALID_RETURN_PACKAGE,
        "Unable to receive return package. Has the robot gone to sleep?");
    errorMessages.put(ERROR_NXT_ERROR_CODE_RECEIVED,
        "Error code received from robot: %s.");
    errorMessages.put(ERROR_NXT_INVALID_PROGRAM_NAME,
        "Invalid program name.");
    errorMessages.put(ERROR_NXT_INVALID_FILE_NAME,
        "Invalid file name.");
    errorMessages.put(ERROR_NXT_INVALID_MOTOR_PORT,
        "The NXT does not have a motor port labeled %s.");
    errorMessages.put(ERROR_NXT_INVALID_SENSOR_PORT,
        "The NXT does not have a sensor port labeled %s.");
    errorMessages.put(ERROR_NXT_INVALID_MAILBOX,
        "The NXT does not have a mailbox number %s.");
    errorMessages.put(ERROR_NXT_MESSAGE_TOO_LONG,
        "The NXT only accepts messages up to 58 characters.");
    errorMessages.put(ERROR_NXT_DATA_TOO_LARGE,
        "The data is too large; it must be 16 bytes or less.");
    errorMessages.put(ERROR_NXT_COULD_NOT_DECODE_ELEMENT,
        "Could not decode element %s as an integer.");
    errorMessages.put(ERROR_NXT_COULD_NOT_FIT_ELEMENT_IN_BYTE,
        "Could not fit element %s into 1 byte.");
    errorMessages.put(ERROR_NXT_INVALID_SOURCE_ARGUMENT,
        "Invalid source argument.");
    errorMessages.put(ERROR_NXT_INVALID_DESTINATION_ARGUMENT,
        "Invalid destination argument.");
    errorMessages.put(ERROR_NXT_UNABLE_TO_DOWNLOAD_FILE,
        "Unable to download file to robot: %s");
    errorMessages.put(ERROR_NXT_CANNOT_DETECT_COLOR,
        "Cannot detect color when the DetectColor property is set to False.");
    errorMessages.put(ERROR_NXT_CANNOT_DETECT_LIGHT,
        "Cannot detect light level when the DetectColor property is set to True.");
    errorMessages.put(ERROR_NXT_INVALID_GENERATE_COLOR,
        "The GenerateColor property is limited to None, Red, Green, or Blue.");
    // Bluetooth errors
    errorMessages.put(ERROR_BLUETOOTH_NOT_AVAILABLE,
        "Bluetooth is not available.");
    errorMessages.put(ERROR_BLUETOOTH_NOT_ENABLED,
        "Bluetooth is not available.");
    errorMessages.put(ERROR_BLUETOOTH_INVALID_ADDRESS,
        "The specified address is not a valid Bluetooth MAC address.");
    errorMessages.put(ERROR_BLUETOOTH_NOT_PAIRED_DEVICE,
        "The specified address is not a paired Bluetooth device.");
    errorMessages.put(ERROR_BLUETOOTH_NOT_REQUIRED_CLASS_OF_DEVICE,
        "The specified address is not the required class of device.");
    errorMessages.put(ERROR_BLUETOOTH_INVALID_UUID,
        "The UUID \"%s\" is not formatted correctly.");
    errorMessages.put(ERROR_BLUETOOTH_UNABLE_TO_CONNECT,
        "Unable to connect. Is the device turned on?");
    errorMessages.put(ERROR_BLUETOOTH_UNABLE_TO_LISTEN,
        "Unable to listen for a connection from a bluetooth device.");
    errorMessages.put(ERROR_BLUETOOTH_UNABLE_TO_ACCEPT,
        "Unable to accept a connection from a bluetooth device.");
    errorMessages.put(ERROR_BLUETOOTH_COULD_NOT_DECODE,
        "Could not decode \"%s\" as an integer.");
    errorMessages.put(ERROR_BLUETOOTH_COULD_NOT_FIT_NUMBER_IN_BYTE,
        "Could not fit \"%s\" into 1 byte.");
    errorMessages.put(ERROR_BLUETOOTH_COULD_NOT_FIT_NUMBER_IN_BYTES,
        "Could not fit \"%s\" into %s bytes.");
    errorMessages.put(ERROR_BLUETOOTH_COULD_NOT_DECODE_ELEMENT,
        "Could not decode element %s as an integer.");
    errorMessages.put(ERROR_BLUETOOTH_COULD_NOT_FIT_ELEMENT_IN_BYTE,
        "Could not fit element %s into 1 byte.");
    errorMessages.put(ERROR_BLUETOOTH_NOT_CONNECTED_TO_DEVICE,
        "Not connected to a Bluetooth device.");
    errorMessages.put(ERROR_BLUETOOTH_UNABLE_TO_WRITE,
        "Unable to write: %s");
    errorMessages.put(ERROR_BLUETOOTH_UNABLE_TO_READ,
        "Unable to read: %s");
    errorMessages.put(ERROR_BLUETOOTH_END_OF_STREAM,
        "End of stream has been reached.");
    errorMessages.put(ERROR_BLUETOOTH_UNSUPPORTED_ENCODING,
        "The encoding %s is not supported.");
    // ActivityStarter errors
    errorMessages.put(ERROR_ACTIVITY_STARTER_NO_CORRESPONDING_ACTIVITY,
        "No corresponding activity was found.");
    // Media errors
    errorMessages.put(ERROR_UNABLE_TO_LOAD_MEDIA,
        "Unable to load %s.");
    errorMessages.put(ERROR_UNABLE_TO_PREPARE_MEDIA,
        "Unable to prepare %s.");
    errorMessages.put(ERROR_UNABLE_TO_PLAY_MEDIA,
        "Unable to play %s.");
    errorMessages.put(ERROR_MEDIA_EXTERNAL_STORAGE_READONLY,
        "External storage is available but read-only.");
    errorMessages.put(ERROR_MEDIA_EXTERNAL_STORAGE_NOT_AVAILABLE,
        "External storage is not available.");
    errorMessages.put(ERROR_MEDIA_IMAGE_FILE_FORMAT,
        "Image file name must end in \".jpg\", \".jpeg\", or \".png\".");
    errorMessages.put(ERROR_MEDIA_CANNOT_OPEN,
        "Cannot open file %s.");
    errorMessages.put(ERROR_MEDIA_FILE_ERROR, "Got file error: %s.");
     // SoundRecorder errors
    errorMessages.put(ERROR_SOUND_RECORDER, "An unexpected error occurred while recording sound.");
    errorMessages.put(ERROR_SOUND_RECORDER_CANNOT_CREATE, "Cannot start recording: %s");
    // Form errors
    errorMessages.put(ERROR_INVALID_SCREEN_ORIENTATION,
        "The specified screen orientation is not valid: %s");
    errorMessages.put(ERROR_SCREEN_NOT_FOUND, "Screen not found: %s");
    errorMessages.put(ERROR_SCREEN_BAD_VALUE_RECEIVED,
        "Bad value received from other screen: %s");
    errorMessages.put(ERROR_SCREEN_BAD_VALUE_FOR_SENDING,
        "Bad value for sending to other screen: %s");
    // Canvas errors
    errorMessages.put(ERROR_CANVAS_BITMAP_ERROR, "Error getting Canvas contents to save");
    // Web errors
    errorMessages.put(ERROR_WEB_UNABLE_TO_GET,
        "Unable to get a response with the specified URL: %s");
    errorMessages.put(ERROR_WEB_UNSUPPORTED_ENCODING,
        "The encoding %s is not supported.");
    errorMessages.put(ERROR_WEB_UNABLE_TO_POST,
        "Unable to post the text \"%s\" with the specified URL: %s");
    errorMessages.put(ERROR_WEB_UNABLE_TO_POST_FILE,
        "Unable to post the file \"%s\" with the specified URL %s.");
    errorMessages.put(ERROR_WEB_JSON_TEXT_DECODE_FAILED,
        "Unable to decode the JSON text: %s");
    errorMessages.put(ERROR_WEB_HTML_TEXT_DECODE_FAILED,
        "Unable to decode the HTML text: %s");
    errorMessages.put(ERROR_WEB_MALFORMED_URL,
        "The specified URL is not valid: %s");
    errorMessages.put(ERROR_WEB_REQUEST_HEADER_NOT_LIST,
        "The specified request headers are not valid: element %s is not a list");
    errorMessages.put(ERROR_WEB_REQUEST_HEADER_NOT_TWO_ELEMENTS,
        "The specified request headers are not valid: element %s does not contain two elements");
    errorMessages.put(ERROR_WEB_BUILD_POST_DATA_NOT_LIST,
        "Unable to build post data: element %s is not a list");
    errorMessages.put(ERROR_WEB_BUILD_POST_DATA_NOT_TWO_ELEMENTS,
        "Unable to build post data: element %s does not contain two elements");
    // Contact picker (and PhoneNumberPicker) errors
    errorMessages.put(ERROR_PHONE_UNSUPPORTED_CONTACT_PICKER,
        "The software used in this app cannot extract contacts from this type of phone.");
    errorMessages.put(ERROR_PHONE_UNSUPPORTED_SEARCH_IN_CONTACT_PICKING,
        "To pick contacts, pick them directly, without using search.");
      
    // Camcorder errors
    errorMessages.put(ERROR_CAMCORDER_NO_CLIP_RETURNED,
    	"The camcorder did not return a clip.");

    // VideoPlayer errors
    errorMessages.put(ERROR_VIDEOPLAYER_FULLSCREEN_UNAVAILBLE,
        "Cannot start fullscreen mode.");
    errorMessages.put(ERROR_VIDEOPLAYER_FULLSCREEN_CANT_EXIT,
        "Cannot exit fullscreen mode.");
    errorMessages.put(ERROR_VIDEOPLAYER_FULLSCREEN_UNSUPPORTED,
        "Fullscreen mode not supported on this version of Android.");
    // Arrangement errors
    errorMessages.put(ERROR_BAD_VALUE_FOR_HORIZONTAL_ALIGNMENT,
        "The value -- %s -- provided for HorizontalAlignment was bad.  The only legal values " +
                        "are 1, 2, or 3.");
    errorMessages.put(ERROR_BAD_VALUE_FOR_VERTICAL_ALIGNMENT,
        "The value -- %s -- provided for VerticalAlignment was bad.  The only legal values " +
            "are 1, 2, or 3.");
    errorMessages.put(ERROR_NO_SCANNER_FOUND,
        "Your device does not have a scanning application installed.");
    errorMessages.put(ERROR_CANNOT_SAVE_IMAGE,
        "Unable to save image: %s");
    errorMessages.put(ERROR_CANNOT_COPY_MEDIA,
        "Unable to copy selected media: %s");
    // Texting errors
    errorMessages.put(ERROR_BAD_VALUE_FOR_TEXT_RECEIVING,
      "Text Receiving should be either 1, 2 or 3.");    
    
    // CallLogs history errors
    errorMessages.put(ERROR_DATE_FORMAT,
      "The date string has wrong format, please refer to the documentation of the setting method again.");
    
    errorMessages.put(ERROR_DROPBOX_BLANK_APP_KEY_OR_SECRET, 
        "The AppKey and AppSecret properties must be set in order to authorize access " +
        "for Dropbox. Please obtain a App Key and App Secret specific to your app from " +
        "https://www.dropbox.com/developers/apps");
    
    errorMessages.put(ERROR_DROPBOX_EXCEPTION,
    "Dropbox error: %s");
    
    errorMessages.put(ERROR_DROPBOX_FILESIZE, "This file is too big to upload, at most " +
        "150 MB.");
    errorMessages.put(ERROR_DROPBOX_UNLINKED , "This app wasn't authenticated properly");
    errorMessages.put(ERROR_DROPBOX_IO, "Network error while uploading the file.");
    
    errorMessages.put(ERROR_DROPBOX_PARTIALFILE, "The operation was canceled by Dropbox");
    
    errorMessages.put(ERROR_DROPBOX_SERVER_INSUFFICIENT_STORAGE, "Your dropbox usage is over quota.");
    
    errorMessages.put(ERROR_DROPBOX_FILENOTFOUND, "The file to upload was not found.");
    errorMessages.put(ERROR_DROPBOX_NO_TWO_RUNNING_TASKS, "Need to stop previous scheduled task first, " +
        "by calling <code>StopScheduleUpload</code>.");
    

    errorMessages.put(ERROR_GOOGLEDRIVE_IO_EXCEPTION, "Error happened with connection or file I/O");
    errorMessages.put(ERROR_GOOGLEDRIVE_EXCEPTION, "Something wrong with Google Drive");
    
    errorMessages.put(ERROR_SENSORDB_NOTAVAILABLE,"%s is not available or not the correct name, " +
    "select one by calling <code>AvailableActiveSensors</code>");
    
    errorMessages.put(ERROR_SENSORDB_NOTACTIVE, "%s is not cuurently active");

    errorMessages.put(ERROR_GOOGLE_PLAY_NOT_INSTALLED, "Google Play is not installed/available on this phone");
    errorMessages.put(ERROR_GOOGLE_PLAY_SERVICE_UPDATE_REQUIRED, "Google Play Service needs update to newest version");
    errorMessages.put(ERROR_GOOGLE_MAP_NOT_INSTALLED, "Google Map is not installed on this phone");
    errorMessages.put(ERROR_GOOGLE_MAP_INVALID_INPUT, "Invalid input");
    errorMessages.put(ERROR_GOOGLE_MAP_MARKER_NOT_EXIST, "Marker with id: %s does not exist");
    errorMessages.put(ERROR_GOOGLE_MAP_JSON_FORMAT_DECODE_FAILED,
        "Unable to decode the JSON text: %s");
    errorMessages.put(ERROR_GOOGLE_MAP_CIRCLE_NOT_EXIST, "Circle with id: %s does not exist");
    errorMessages.put(ERROR_GOOGLE_PLAY_DISABLED, "The installed version of Google Play services " +
        "has been disabled on this device.");
    errorMessages.put(ERROR_GOOGLE_PLAY_INVALID, "The version of the Google Play services installed " +
        "on this device is not authentic.");


  }

  private ErrorMessages() {
  }

  public static String formatMessage(int errorNumber, Object[] messageArgs) {
    String format = errorMessages.get(errorNumber);
    return String.format(format, messageArgs);
  }
}
