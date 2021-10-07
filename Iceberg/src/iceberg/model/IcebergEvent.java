/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iceberg.model;

import java.time.LocalDate;

public abstract class IcebergEvent {
    LocalDate date;
    Iceberg iceberg;
}
