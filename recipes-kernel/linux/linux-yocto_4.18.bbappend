FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# We use kernel defconfigs where everything unmarked defaults to Y but 
# Yocto defaults to allnoconfig. This parameters makes them usable in yocto
KCONFIG_MODE = "--alldefconfig"

KBRANCH_qemumipsmn ?= "v4.18/standard/base"

# qemu mips32r2el
COMPATIBLE_MACHINE_qemumipsmn = "qemumipsmn"
KBUILD_DEFCONFIG_qemumipsmn = "malta_defconfig"
SRC_URI_append_qemumipsmn += "file://qemumips32el.cfg"


