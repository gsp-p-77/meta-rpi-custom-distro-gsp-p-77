DESCRIPTION = "Recipe for CMake with Simple hello world C application"

LICENSE= "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://source/hello.c \
           file://CMakeLists.txt"

S = "${WORKDIR}"

inherit cmake

# Optional: Install to /bin instead of /usr/bin
# EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX:PATH=/"


