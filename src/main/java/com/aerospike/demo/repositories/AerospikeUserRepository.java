package com.aerospike.demo.repositories;

import com.aerospike.demo.object.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface AerospikeUserRepository extends AerospikeRepository<User, Integer> {
}
