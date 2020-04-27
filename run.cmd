docker build -t coral_reef .
@echo (Even if you answer N, you can continue)
@docker image prune
mkdir data
docker run -it --rm -p 19132:19132/udp -v /data:/data --name CoralReef  coral_reef