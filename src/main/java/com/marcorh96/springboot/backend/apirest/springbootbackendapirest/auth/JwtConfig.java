package com.marcorh96.springboot.backend.apirest.springbootbackendapirest.auth;

public class JwtConfig {
    public static final String LLAVA_SECRETA="alguna.clave.secreta.12345678";

    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"+
    "MIIEpAIBAAKCAQEAvVWrmOT+jigv+tBDPUcvo2+Sxsi36idjDHLRdquq0nGA51Lq\r\n"+
    "+DGUR0Yq8WNrVby0BR2q0fKeAXfwJJweKf8o3MVGehjqfPFUCM+Xa4PBfzVM9WDX\r\n"+
    "X8IEvQ5X5x9LWsbbmZw+wsaibgD6zCDfU773zQtfDEOZxKgqpWO37t3MlcY980CF\r\n"+
    "4HG1G92pSN61BCIc4mQD/CwPFlGVD3T5lMDzCEkaJYu6isMB5BuxUgvor/NH+J1w\r\n"+
    "OLnZMYpc9eJ3Z/uXd/X36WJ4JX1UY/Z8eCmHjsGRHISXehmNTM+QGzkf3D5DV7Qm\r\n"+
    "1dVjLVmBjL3WbiIKVJPlgtOhqVgOHkiUzzqyvwIDAQABAoIBAQCGhO7FU7W0hMMK\r\n"+
    "HZwYVpJ3OVd8WrGo8NED0DQYb4GPwUsHj7cYHgmu1iC+npdtNARnOhvazNkMTA3X\r\n"+
    "xP/9cKe0q4kWSMuZd9Dv7aY0okkBO3pxQJvlEjFRrXYw5OAiH/V4XzWMJ5rSM2n9\r\n"+
    "TEG/+4eOLE0cpo8C1URve7j8QqQPqK+g6AF8C7MHn+sJKdpHej6Thbu2CvtaQVFX\r\n"+
    "cK4xa+uz/jg8H3EmaXcspJt0VKRV7AREsSzA2Soi8g/eJdkF9lMXA7Hy58rzZ7Yh\r\n"+
    "xp35joHceyOTUTVbfocL16D0E44seQOoi49gygaTkpTOBZf+nnArIlpVGzMH+E9X\r\n"+
    "YAizEq0BAoGBAOhc1in3ihWuDVk12CUBqOokaEhnP17bKJR9MHDxoYZXX/QUu8PT\r\n"+
    "ito/e/8C3cFAC0PI5rDX3ZeHsd9O1un03L9k5Bfufvp+VpaKbPa3g/st62dmAxy7\r\n"+
    "A+RJHrz0DNNOKywDXcsshNcM2613VmcczrpZt4EcyAepNso3CDunqks/AoGBANCY\r\n"+
    "TaK9Qt8X2pntcqp1WCC82VvBDBAaR2Q4/gOK9W+r4WxAFddEsxt27R4oMD6+yHwU\r\n"+
    "z2A28GrgFOXIOJ+ktFJH0tjNS7XYnjg4Tm023a916maHSm+eyPBsynfgx8Bm0ubw\r\n"+
    "aUsYHh5NcnvxaZQ1JWwhtNZoF9bViobgFHrZyziBAoGAZAlr7p9y5IiNmKW0y6He\r\n"+
    "Tgekmd9Rig4Cd4M6MrXkm4jMd7HhcJqHghSo1o4uWH+xGdrJbsNQ1GcILiKsJgdU\r\n"+
    "blYKWT9FjaSMtL0d0k4J1T7cxSRHHLxrHYJZaHINf3982LMOU2V0P316qkDhgv0F\r\n"+
    "B3eOqFhyydGRFBgDRGOXzlMCgYBLI0F76H7JC7ejkMOoISLAkCYfhfdJaZ3jvR/K\r\n"+
    "uOhV9Gz76E21wDpgH0OkhEd0opZnE7vrZX7OkK8WYjv7TYHizZpmm/S0qTW8/JNL\r\n"+
    "heLuzCPGEN/AO0sYR6fa7K4nYSKBK4JSGXrn4W/ms3wbddVoEPAp9073BO6kTN0z\r\n"+
    "r3YjgQKBgQDZ4RXVZXMcVcmvRxUJbnDjMPcAWiAQzOITeIoli1jQu5VFnso5vxs2\r\n"+
    "NhX/2fZ6wOGU2OkKl0oFlQp+o1nZFksT8rsSGb8YSR3RWzfS+3uGwwdzjNoZ28BS\r\n"+
    "GeaOEKccjgahnqRbxuGSH+pLEadXSa6+Qtta6i3jTDpDQNG7P7irFA==\r\n"+
    "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"+
    "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvVWrmOT+jigv+tBDPUcv\r\n"+
    "o2+Sxsi36idjDHLRdquq0nGA51Lq+DGUR0Yq8WNrVby0BR2q0fKeAXfwJJweKf8o\r\n"+
    "3MVGehjqfPFUCM+Xa4PBfzVM9WDXX8IEvQ5X5x9LWsbbmZw+wsaibgD6zCDfU773\r\n"+
    "zQtfDEOZxKgqpWO37t3MlcY980CF4HG1G92pSN61BCIc4mQD/CwPFlGVD3T5lMDz\r\n"+
    "CEkaJYu6isMB5BuxUgvor/NH+J1wOLnZMYpc9eJ3Z/uXd/X36WJ4JX1UY/Z8eCmH\r\n"+
    "jsGRHISXehmNTM+QGzkf3D5DV7Qm1dVjLVmBjL3WbiIKVJPlgtOhqVgOHkiUzzqy\r\n"+
    "vwIDAQAB\r\n"+
    "-----END PUBLIC KEY-----";
}
