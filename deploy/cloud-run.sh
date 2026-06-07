#!/usr/bin/env bash
set -euo pipefail

SERVICE_NAME="${SERVICE_NAME:-damilon5}"
REGION="${REGION:-europe-southwest1}"
PROJECT_ID="${PROJECT_ID:-}"

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SOURCE_DIR="$(cd "${SCRIPT_DIR}/../damilon5" && pwd)"

if [[ -n "${PROJECT_ID}" ]]; then
  gcloud config set project "${PROJECT_ID}"
fi

gcloud run deploy "${SERVICE_NAME}" \
  --source "${SOURCE_DIR}" \
  --region "${REGION}" \
  --allow-unauthenticated \
  --timeout 3600 \
  --session-affinity \
  --min-instances 0 \
  --port 8080

echo "Despliegue completado."
