
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit kernel

DEPENDS += "lzop-native bc-native"

PR = "r0"
SRCREV = "${AUTOREV}"

SRCBRANCH = "v4.19"

SRC_URI = "git://github.com/djeman/linux-lan5200wrx.git;branch=${SRCBRANCH} \
           file://defconfig"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "4.19.53"

COMPATIBLE_MACHINE = "(medianav)"
