# Contratos entre sistemas

Un archivo OpenAPI 3 por sistema: `oficialia.yaml`, `peritos.yaml`, `audiencias.yaml`, `tocas.yaml`.

- Rutas `/api/v1/<recurso>` en inglés y en plural.
- JSON en camelCase y fechas en ISO 8601.
- Errores con el formato de `ApiError` del módulo `common`.
- Cambiar un contrato requiere aprobación del equipo `arquitectura`.
