# Docker Hub imagePullSecret

Create the imagePullSecret `regcred` in the `demo` namespace to pull private images.

## Linux / macOS (bash/zsh)
```bash
kubectl create secret docker-registry regcred   --docker-server=index.docker.io   --docker-username=DOCKERHUB_USERNAME   --docker-password=DOCKERHUB_PASSWORD   --docker-email=you@example.com   -n demo
```

## Windows PowerShell
```powershell
kubectl create secret docker-registry regcred `
  --docker-server=index.docker.io `
  --docker-username=DOCKERHUB_USERNAME `
  --docker-password=DOCKERHUB_PASSWORD `
  --docker-email=you@example.com `
  -n demo
```
