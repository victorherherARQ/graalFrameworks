**Generate the image:**
docker build --no-cache -t hub-docker.lares.dsd:5000/arquitectura/sct/sct-rds:latest .

**Run container**
docker run -d -t --name cnt-sct-rds -p 4306:3306 -e MYSQL_ROOT_PASSWORD=root hub-docker.lares.dsd:5000/arquitectura/sct/sct-rds:latest

WARNING: External port 3306 not allowed

** Test connection **
mysql -P 4306 -uroot -proot -h 127.0.0.1

** Stop the container **
mysql stop cnt-sct-rds

** Start the container (if exists) **
mysql start cnt-sct-rds

**Push the image to private registry:**
docker push hub-docker.lares.dsd:5000/arquitectura/sct/sct-rds

