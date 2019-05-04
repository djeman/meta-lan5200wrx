SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL} e2fsprogs dosfstools"

inherit core-image

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
PACKAGE_INSTALL = "${IMAGE_INSTALL}"
