FROM openjdk:8

COPY target/universal/web-*.tgz .
COPY start-docker.sh .
RUN chmod +x start-docker.sh
RUN tar xvf web-*.tgz
EXPOSE 9050

CMD ["sh", "start-docker.sh"]