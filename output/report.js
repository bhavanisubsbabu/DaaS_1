$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Drawinglayer/Createdrawinglayer.feature");
formatter.feature({
  "id": "as-a-resilience-direct-user-to-save-my-current-set-of-drawn-points,-lines-and-shapes-as-a-layer-and-give",
  "tags": [
    {
      "name": "@drawing",
      "line": 1
    }
  ],
  "description": "it a name in the Map Browser user panel I can view it as a layer\r\n(Note: the drawn layer will only be persisted once the entire Map is saved )",
  "name": "As A Resilience Direct user To save my current set of drawn points, lines and shapes as a layer and give",
  "keyword": "Feature",
  "line": 2
});
formatter.background({
  "description": "",
  "name": "Login to the Resilience Direct service with valid Admin username and password",
  "keyword": "Background",
  "line": 6,
  "type": "background"
});
formatter.step({
  "name": "user types \"MapmakerURL\" in browser URL space",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "navigates to Mapmaker \"Login\" page",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "user types \"rahul\" in \"usernameField\" texbox",
  "keyword": "Given ",
  "line": 9
});
formatter.step({
  "name": "types \"Testing123@\" in \"passwordField\" texbox",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "user clicks on \"SignIn\" button",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "I should see \"rahul\" as my \"displayname\" in Resilience Direct page",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "MapmakerURL",
      "offset": 12
    }
  ],
  "location": "CommonStepDef.user_types_in_browser_URL_space(String)"
});
formatter.result({
  "duration": 2474726040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 23
    }
  ],
  "location": "CommonStepDef.navigates_to_Mapmaker(String)"
});
formatter.result({
  "duration": 39353864,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rahul",
      "offset": 12
    },
    {
      "val": "usernameField",
      "offset": 23
    }
  ],
  "location": "CommonStepDef.user_types_in_texbox(String,String)"
});
formatter.result({
  "duration": 226279882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing123@",
      "offset": 7
    },
    {
      "val": "passwordField",
      "offset": 24
    }
  ],
  "location": "CommonStepDef.types_in_texbox(String,String)"
});
formatter.result({
  "duration": 246481209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 16
    }
  ],
  "location": "CommonStepDef.user_clicks_on_button(String)"
});
formatter.result({
  "duration": 5176894037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rahul",
      "offset": 14
    },
    {
      "val": "displayname",
      "offset": 28
    }
  ],
  "location": "AdminLogin.I_should_see_as_my_in_Resilience_Direct_page(String,String)"
});
formatter.result({
  "duration": 5125182067,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-resilience-direct-user-to-save-my-current-set-of-drawn-points,-lines-and-shapes-as-a-layer-and-give;adding-a-new-drawing-layer-with-layer-name",
  "tags": [
    {
      "name": "@drawing1",
      "line": 14
    }
  ],
  "description": "",
  "name": "Adding a new drawing layer with layer name",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "user can see a \"sidebar-switch\" on the Resilience Direct map page",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "I click on the \"sidebar-switch\"",
  "keyword": "When ",
  "line": 17
});
formatter.step({
  "name": "I should see a deault \"Radiobutton\" with OS CS PRO Base Layer",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "I click on \"Maplayericon\" on the sidebar-switch space",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "I should see \"Addlayertomap\" pop up box",
  "keyword": "Then ",
  "line": 20
});
formatter.step({
  "name": "I type \"Test\" as \"layer\" name on the pop-up box",
  "keyword": "And ",
  "line": 21
});
formatter.step({
  "name": "click on the \"AddlayertoMapBtn\" on the pop-up box",
  "keyword": "And ",
  "line": 22
});
formatter.step({
  "name": "I should see  drawing tool for drawing \"line\" on the map page",
  "keyword": "And ",
  "line": 23
});
formatter.step({
  "name": "\"ploygonShape\" drwaing tool is  available on the map page",
  "keyword": "And ",
  "line": 24
});
formatter.step({
  "name": "the \"Test\" should appear with \"Check-boxed\" in the sidebar-switch space as drawing layer",
  "keyword": "And ",
  "line": 25
});
formatter.match({
  "arguments": [
    {
      "val": "sidebar-switch",
      "offset": 16
    }
  ],
  "location": "Createdrawinglayer.user_can_see_a_on_the_Resilience_Direct_map_page(String)"
});
formatter.result({
  "duration": 47708256,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sidebar-switch",
      "offset": 16
    }
  ],
  "location": "Createdrawinglayer.I_click_on_the(String)"
});
formatter.result({
  "duration": 73910219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radiobutton",
      "offset": 23
    }
  ],
  "location": "Createdrawinglayer.I_should_see_a_deault_with_OS_CS_PRO_Base_Layer(String)"
});
formatter.result({
  "duration": 45841198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maplayericon",
      "offset": 12
    }
  ],
  "location": "Createdrawinglayer.I_click_on_on_the_sidebar_switch_space(String)"
});
formatter.result({
  "duration": 107120950,
  "status": "failed",
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element is not clickable at point (-16, 850)\n  (Session info: chrome\u003d28.0.1500.72)\n  (Driver info: cdddd\u003d0.7,platform\u003dWindows NT 6.1 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 57 milliseconds\nBuild info: version: \u00272.39.0\u0027, revision: \u002714fa800511cc5d66d426e08b0b2ab926c7ed7398\u0027, time: \u00272013-12-16 13:18:38\u0027\nSystem info: host: \u0027ND27963\u0027, ip: \u002710.160.38.44\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_45\u0027\nSession ID: e48a7b8d3f3514f06c05ada9c63905ee\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{platform\u003dXP, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, browserName\u003dchrome, rotatable\u003dfalse, driverVersion\u003d0.7, locationContextEnabled\u003dtrue, version\u003d28.0.1500.72, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, handlesAlerts\u003dtrue, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, webStorageEnabled\u003dtrue, applicationCacheEnabled\u003dfalse, takesScreenshot\u003dtrue}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:526)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:193)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:145)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:554)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\r\n\tat os.mapmaker.util.WebConnector.clickByXPath(WebConnector.java:87)\r\n\tat os.mapmaker.testcases.Createdrawinglayer.I_click_on_on_the_sidebar_switch_space(Createdrawinglayer.java:36)\r\n\tat ✽.And I click on \"Maplayericon\" on the sidebar-switch space(Drawinglayer/Createdrawinglayer.feature:19)\r\n"
});
formatter.match({
  "arguments": [
    {
      "val": "Addlayertomap",
      "offset": 14
    }
  ],
  "location": "Createdrawinglayer.I_should_see_pop_up_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 8
    },
    {
      "val": "layer",
      "offset": 18
    }
  ],
  "location": "Createdrawinglayer.I_type_as_name_on_the_pop_up_box(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "AddlayertoMapBtn",
      "offset": 14
    }
  ],
  "location": "Createdrawinglayer.click_on_the_on_the_pop_up_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "line",
      "offset": 40
    }
  ],
  "location": "Createdrawinglayer.I_should_see_drawing_tool_for_drawing_on_the_map_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ploygonShape",
      "offset": 1
    }
  ],
  "location": "Createdrawinglayer.drwaing_tool_is_available_on_the_map_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 5
    },
    {
      "val": "Check-boxed",
      "offset": 31
    }
  ],
  "location": "Createdrawinglayer.the_should_appear_with_in_the_sidebar_switch_space_as_drawing_layer(String,String)"
});
formatter.result({
  "status": "skipped"
});
});