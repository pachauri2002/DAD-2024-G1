package com.example.mscatalogo.service.Impl;

import com.example.mscatalogo.entity.Cliente;
import com.example.mscatalogo.repository.ClienteRepository;
import com.example.mscatalogo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> listarPorId(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        clienteRepository.deleteById(id);
    }
}
