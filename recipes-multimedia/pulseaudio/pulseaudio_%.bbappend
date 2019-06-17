
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://daemon.conf file://default.pa"

do_install_append() {
    if [ -e "${WORKDIR}/daemon.conf" ] && [ -e "${WORKDIR}/default.pa" ]; then
        install -m 0644 ${WORKDIR}/daemon.conf ${D}${sysconfdir}/pulse/daemon.conf
        install -m 0644 ${WORKDIR}/default.pa ${D}${sysconfdir}/pulse/default.pa
    fi
}

