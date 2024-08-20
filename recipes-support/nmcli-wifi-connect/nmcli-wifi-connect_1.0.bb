SUMMARY = "Custom service to connect to Wi-Fi network using nmcli"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://nmcli-wifi-connect.service"

S = "${WORKDIR}"

inherit allarch systemd

# Specify the files and directories to be included in the package
FILES_${PN} += "${systemd_system_unitdir}"

do_install() {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/nmcli-wifi-connect.service ${D}${systemd_unitdir}/system/
}

# Enable the service automatically
SYSTEMD_AUTO_ENABLE = "enable"

SYSTEMD_SERVICE_${PN} = "nmcli-wifi-connect.service"

