SUMMARY = "Install and start Portainer via Docker"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://portainer_install.service"


inherit systemd

# Specify the files and directories to be included in the package
FILES:${PN} += "${systemd_system_unitdir}"



do_install() {
    install -d ${D}${sysconfdir}/systemd/system/
    install -m 0644 ${WORKDIR}/portainer_install.service ${D}${sysconfdir}/systemd/system/
}

# Enable the service automatically
SYSTEMD_AUTO_ENABLE = "enable"

SYSTEMD_SERVICE:${PN} = "portainer_install.service"
