docker network create network-pfa-desafio1

docker run --init -it --name desafio1-mysql --network network-pfa-desafio1 felipeomachado/pfa-desafio1-mysql

docker run --init -it --name desafio1-app --network network-pfa-desafio1 felipeomachado/pfa-desafio1-app

docker run --init -it --name nginx --network network-pfa-desafio1 -p 8080:80 felipeomachado/pfa-desafio1-nginx