# TEL-Keyboard


<img src="images/screenshot-0.png"
      alt="closeup"
      width="500"/>
      

## Changes:
- add BroadcastReceiver to change background color and theme from other apps: `am broadcast --user 0 --es color "#1f1f1f" --es theme 1 -a com.tel.keyboard.inputmethod.THEME com.tel.keyboard.inputmethod`
- swipe to delete and select is enabled by default
- vibration on keypress is disabled by default
- background color of dark themes is: `#1f1f1f`


## Credits:

Fork of [Simple Keyboard](https://github.com/rkkr/simple-keyboard)

Licensed under Apache License Version 2

This keyboard is based on AOSP LatineIME keyboard. You can get the original source code in https://android.googlesource.com/platform/packages/inputmethods/LatinIME/
