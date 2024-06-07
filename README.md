## Install Docker

```markdown



```sh
yum update -y
yum install docker -y
systemctl start docker
systemctl enable docker
yum install conntrack -y
```

## Install Minikube
```sh
curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64
sudo install minikube-linux-amd64 /usr/local/bin/minikube
minikube version
```

## Start Minikube
```sh
/usr/local/bin/minikube start --force --driver=docker
/usr/local/bin/minikube version
```

## Install kubectl
```sh
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
/usr/local/bin/kubectl version
```

## Clone Repository
```sh
cd /opt/
git clone https://github.com/yreddys/kubernetes2.git
```

## Deploy MySQL
```sh
/usr/local/bin/kubectl create -f /opt/kubernetes2/db-deployment.yaml
/usr/local/bin/kubectl get pods
/usr/local/bin/kubectl exec -it mysql-f759455cd-2dh8m -- /bin/bash
mysql -u root -p
```

## MySQL Commands Inside Pod
```sql
SHOW DATABASES;
```

## Install Maven
```sh
yum install maven -y
```

## Build Docker Image for Spring Boot Application
```sh
cd /opt/kubernetes2/
docker build -t yreddys211/springboot-crud-k8s:1.0 .
```

## Deploy Spring Boot Application
```sh
/usr/local/bin/kubectl apply -f /opt/kubernetes2/app-deployment.yaml
/usr/local/bin/kubectl get svc
/usr/local/bin/minikube ip
```

## Port Forwarding
```sh
/usr/local/bin/kubectl port-forward --address 0.0.0.0 svc/springboot-crud-svc 8080:8080 &
```


