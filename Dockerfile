FROM ubuntu:latest
LABEL authors="jawoon"

ENTRYPOINT ["top", "-b"]