FILESEXTRAPATHS_prepend := "\${THISDIR}/files:"
SRC_URI += "file://wpa_supplicant.conf"
do_install_append() {
    install -d \${D}\${sysconfdir}/wpa_supplicant/
    install -m 0644 \${WORKDIR}/wpa_supplicant.conf \${D}\${sysconfdir}/wpa_supplicant/wpa_supplicant.conf
}
