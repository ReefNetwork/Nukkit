docker build -t coral_reef
docker run -it --rm -p 19132:19132/udp -v /data:/data --name CoralReef  coral_reef