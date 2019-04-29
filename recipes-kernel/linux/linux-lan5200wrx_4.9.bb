
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

DEPENDS += "lzop-native bc-native"

PR = "r0"
SRCREV = "${AUTOREV}"

SRCBRANCH = "v4.9"

SRC_URI = "git://github.com/djeman/linux-lan5200wrx.git;branch=${SRCBRANCH} \
           file://defconfig"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "4.9.170"

COMPATIBLE_MACHINE = "(medianav1|medianav2)"
