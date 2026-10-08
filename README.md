# REPL4Y

REPL4Y 1.7 — runtime BlackBox com gerenciamento econômico de armazenamento.

## Build

O GitHub Actions compila automaticamente o APK Debug em cada push/PR. O APK fica disponível em **Actions → workflow → Artifacts**.

## Regras

- Não versionar `local.properties`, `build/` ou APKs gerados.
- Não colocar keystores, chaves privadas ou senhas no repositório.
- Para uma release assinada, usar GitHub Secrets.
- O runtime mantém apenas o ambiente virtual necessário e faz limpeza segura de temporários/cache.

## Observação

A pasta `app/` e os módulos do projeto devem conter a fonte completa do REPL4Y antes do build.
