# xinput-calibrator-once expects an evdev interface, so don't install
# xf86-input-libinput which takes precedence over xf86-input-evdev
XSERVER_RRECOMMENDS_remove = "xf86-input-libinput"
