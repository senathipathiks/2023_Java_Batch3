FROM node:alpine

RUN npm install -g json-server

COPY . /app/reactapp/Database

WORKDIR /app/reactapp/Database

RUN json-server --watch db.json --port 8000