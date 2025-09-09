package org.homework.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String email;
}
