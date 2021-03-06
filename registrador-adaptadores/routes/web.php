<?php

use App\Models\Localizacao;
use Illuminate\Http\Request;

$router->get('/', function () use ($router) {
    return $router->app->version();
});
/**
 * Esse componente é o registrador de adaptadores
 * 
 */
$router->post('/registrar-adaptador', GerenciadorRegra::class . '@registrarRegra');
$router->get('/tratar-localizacoes', Controller::class . '@setLocalizacoes');
