#!/bin/sh

set -e
set +x

jextract --dump-includes includes.txt main.h || :
INCLUDE_ARGS=$(cat includes.txt | egrep -i "(win[^\]*|[^\]*api)\.h" | grep -v "\s__" | grep -v "\s_[A-Z]")
rm includes.txt
echo "$INCLUDE_ARGS" > includes.txt

jextract \
--output src/main/java \
--target-package app.cleancode.bindings.win32 \
--header-class-name WINDOWS \
--source \
@includes.txt \
main.h
