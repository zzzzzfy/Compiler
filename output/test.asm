;default rel

global main
global S_substring
global S_parseInt
global S_ord
global S_strcpy
global S_strcat
global S_strlen
global F_print
global F_println
global F_getString
global F_getInt
global F_toString

extern __sprintf_chk
extern _IO_getc
extern stdin
extern puts
extern scanf
extern _IO_putc
extern stdout
extern __stack_chk_fail
extern sscanf
extern memcpy
extern malloc

SECTION .text

S_strlen:
        xor     eax, eax
        cmp     byte [rdi], 0
        jz      L_002





ALIGN   16
L_001:  add     rax, 1
        cmp     byte [rdi+rax], 0
        jnz     L_001

        ret

L_002:

        ret






ALIGN   8

S_strcat:
        jmp     L_004





ALIGN   8
L_003:  add     rdi, 1
L_004:  cmp     byte [rdi], 0
        jnz     L_003
        movzx   eax, byte [rsi]
        test    al, al
        jz      L_006




ALIGN   16
L_005:  add     rdi, 1
        add     rsi, 1
        mov     byte [rdi-1H], al
        movzx   eax, byte [rsi]
        test    al, al
        jnz     L_005
L_006:  mov     byte [rdi], 0
        ret







ALIGN   16

S_strcpy:
        jmp     L_008





ALIGN   8
L_007:  add     rdi, 1
        add     rsi, 1
        mov     byte [rdi-1H], al
L_008:  movzx   eax, byte [rsi]
        test    al, al
        jnz     L_007
        mov     byte [rdi], 0
        ret






ALIGN   8

S_substring:
push    r14
        push    r13
        mov     r14, rdi
        push    r12
        push    rbp
        mov     r12, rdx
        push    rbx
        mov     rbp, rdx
        mov     rbx, rsi
        mov     edi, 256
        sub     rbp, rsi
        call    malloc
        cmp     r12, rbx
        mov     rcx, rax
        jl      L_009
        lea     r13, [rbp+1H]
        lea     rsi, [r14+rbx]
        mov     rdi, rax
        mov     rdx, r13
        call    memcpy
        mov     rcx, rax
L_009:  mov     byte [rcx+rbp+1H], 0
        mov     rax, rcx
        pop     rbx
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        ret


S_parseInt:
        sub     rsp, 24
        mov     esi, L_021


        mov     rax, qword [fs:abs 28H]
        mov     qword [rsp+8H], rax
        xor     eax, eax
        mov     rdx, rsp
        call    sscanf
        mov     rcx, qword [rsp+8H]


        xor     rcx, qword [fs:abs 28H]
        mov     rax, qword [rsp]
        jnz     L_010
        add     rsp, 24
        ret

L_010:  call    __stack_chk_fail
        nop
ALIGN   16

S_ord:
        movsx   rax, byte [rdi+rsi]
        ret







ALIGN   16

F_print:
        push    rbx
        mov     rbx, rdi
        movsx   edi, byte [rdi]
        test    dil, dil
        jz      L_012




ALIGN   8
L_011:  mov     rsi, qword [rel stdout]
        add     rbx, 1
        call    _IO_putc
        movsx   edi, byte [rbx]
        test    dil, dil
        jnz     L_011
L_012:  pop     rbx
        ret






ALIGN   8

F_getString:
        push    rbx
        mov     edi, 256
        call    malloc
        mov     edi, L_022
        mov     rbx, rax
        mov     rsi, rax
        xor     eax, eax
        call    scanf
        mov     rax, rbx
        pop     rbx
        ret







ALIGN   16

F_println:
        jmp     puts


        nop





ALIGN   16

F_getInt:
        sub     rsp, 24
        mov     edi, L_021


        mov     rax, qword [fs:abs 28H]
        mov     qword [rsp+8H], rax
        xor     eax, eax
        mov     rsi, rsp
        call    scanf
        mov     rdx, qword [rsp+8H]


        xor     rdx, qword [fs:abs 28H]
        mov     rax, qword [rsp]
        jnz     L_013
        add     rsp, 24
        ret

L_013:  call    __stack_chk_fail
        nop
ALIGN   16

F_toString:
        push    rbx
        mov     rbx, rdi
        mov     edi, 256
        call    malloc
        test    rbx, rbx
        mov     r9, rax
        je      L_019
        js      L_020
        xor     edi, edi
L_014:  movsxd  rsi, edi
        mov     ecx, edi
        mov     r11, qword 6666666666666667H
        add     rsi, r9
        mov     r8, rsi
        jmp     L_016





ALIGN   8
L_015:  mov     ecx, r10d
L_016:  mov     rax, rbx
        add     r8, 1
        lea     r10d, [rcx+1H]
        imul    r11
        mov     rax, rbx
        sar     rax, 63
        sar     rdx, 2
        sub     rdx, rax
        lea     rax, [rdx+rdx*4]
        add     rax, rax
        sub     rbx, rax
        add     ebx, 48
        mov     byte [r8-1H], bl
        test    rdx, rdx
        mov     rbx, rdx
        jnz     L_015
        movsxd  rax, ecx
        add     rax, r9
        cmp     edi, ecx
        jge     L_018




ALIGN   8
L_017:  movzx   edx, byte [rsi]
        movzx   r8d, byte [rax]
        add     edi, 1
        sub     ecx, 1
        add     rsi, 1
        sub     rax, 1
        mov     byte [rsi-1H], r8b
        mov     byte [rax+1H], dl
        cmp     edi, ecx
        jl      L_017
L_018:  mov     rax, r9
        pop     rbx
        ret





ALIGN   8
L_019:  mov     byte [rax], 48
        mov     rax, r9
        pop     rbx
        ret





ALIGN   16
L_020:  neg     rbx
        mov     byte [rax], 45
        mov     edi, 1
        jmp     L_014




main:   
        sub     rsp, 8
        push    rdi
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_getInt
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        pop     rdi
        mov     r9, rax
        mov     rdi, S_0
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_print
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rdi, 256
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    malloc
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rcx, rax
        lea     rdi, [r9*2]
        add     rdi, 1
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_toString
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rsi, rax
        mov     rdi, rcx
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rcx
        mov     rsi, S_1
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, r9
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_toString
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rsi, rax
        mov     rdi, rcx
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rcx
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_println
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rcx, 1
        mov     rdi, 256
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    malloc
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rbx, rax
        mov     r8, 0
        cmp     r8, r9
        jge     lb3
lb0:    mov     rdi, 256
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    malloc
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rdx, rax
        mov     rdi, rcx
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_toString
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rsi, rax
        mov     rdi, rdx
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rdx
        mov     rsi, S_2
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rcx
        add     rdi, 1
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_toString
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rsi, rax
        mov     rdi, rdx
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rdx
        mov     rsi, S_3
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rcx
        add     rdi, 2
        neg     rdi
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_toString
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
        mov     rsi, rax
        mov     rdi, rdx
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcat
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rdi, rbx
        mov     rsi, rdx
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    S_strcpy
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        mov     rsi, 100000
        mov     rax, r8
        cqo   
        idiv    rsi
        mov     rdi, rdx
        cmp     rdi, 0
        jne     lb2
lb1:    mov     rdi, rbx
        sub     rsp, 8
        push    rsi
        push    rdx
        push    rcx
        push    r8
        push    r9
        call    F_println
        pop     r9
        pop     r8
        pop     rcx
        pop     rdx
        pop     rsi
        add     rsp, 8
lb2:    add     rcx, 2
        add     r8, 1
        cmp     r8, r9
        jl      lb0
lb3:    xor     rax, rax
end_main: add     rsp, 8
        ret   



SECTION .data    align=8



SECTION .bss     align=8

SECTION .rodata
S_0: 
         db 70H, 20H, 63H, 6EH, 66H, 20H, 00H
S_1: 
         db 20H, 00H
S_2: 
         db 20H, 00H
S_3: 
         db 20H, 00H

L_021:
        db 25H, 6CH, 64H, 00H

L_022:
        db 25H, 73H, 00H



