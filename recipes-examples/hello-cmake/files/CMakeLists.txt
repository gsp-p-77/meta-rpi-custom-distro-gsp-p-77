cmake_minimum_required(VERSION 3.16.5)
project(cmake_recipe_hello)
add_executable(hello source/hello.c)
install(TARGETS hello DESTINATION bin)
