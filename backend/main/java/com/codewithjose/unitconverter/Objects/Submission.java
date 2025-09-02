package com.codewithjose.unitconverter.Objects;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Submission {
    private String value;
    private String fromUnit;
    private String toUnit;
}
