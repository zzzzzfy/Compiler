default rel

global V_n_0
global V_h_0
global V_now_0
global A_a_0
global V_A_0
global V_M_0
global V_Q_0
global V_R_0
global V_seed_0
global ___init
global random
global initialize
global swap
global pd
global show
global win
global merge
global move
global main
global print
global println
global getString
global getInt
global toString
global string_length
global string_substring
global string_parseInt
global string_ord
global string_strcat
global string_compare

extern strcmp
extern __sprintf_chk
extern memcpy
extern malloc
extern __isoc99_scanf
extern puts
extern __printf_chk


SECTION .text


ALIGN   16

print:
        lea     rdx, [rdi+8H]
        mov     esi, L_032
        mov     edi, 1
        xor     eax, eax
        jmp     __printf_chk


ALIGN   16

println:
        add     rdi, 8
        jmp     puts


ALIGN   8

getString:
        push    rbp
        mov     esi, __buffer.3442
        mov     edi, L_032
        xor     eax, eax
        push    rbx
        mov     ebx, __buffer.3442
        sub     rsp, 8
        call    __isoc99_scanf
L_016:  mov     edx, dword [rbx]
        add     rbx, 4
        lea     eax, [rdx-1010101H]
        not     edx
        and     eax, edx
        and     eax, 80808080H
        jz      L_016
        mov     edx, eax
        shr     edx, 16
        test    eax, 8080H
        cmove   eax, edx
        lea     rdx, [rbx+2H]
        cmove   rbx, rdx
        add     al, al
        sbb     rbx, 3
        sub     rbx, __buffer.3442
        lea     edi, [rbx+8H]
        movsxd  rdi, edi
        call    malloc
        mov     rbp, rax
        lea     rdx, [rbx+1H]
        movsxd  rax, ebx
        lea     rdi, [rbp+8H]
        mov     qword [rbp], rax
        mov     esi, __buffer.3442
        call    memcpy
        add     rsp, 8
        mov     rax, rbp
        pop     rbx
        pop     rbp
        ret


ALIGN   16

getInt:
        sub     rsp, 24
        mov     edi, L_033
        xor     eax, eax
        lea     rsi, [rsp+8H]
        call    __isoc99_scanf
        mov     rax, qword [rsp+8H]
        add     rsp, 24
        ret


        nop

ALIGN   16
toString:
        push    rbp
        mov     rbp, rdi
        mov     edi, 32
        push    rbx
        sub     rsp, 8
        call    malloc
        lea     rdi, [rax+8H]
        mov     rbx, rax
        mov     r8, rbp
        mov     ecx, L_033
        mov     edx, 24
        mov     esi, 1
        xor     eax, eax
        call    __sprintf_chk
        cdqe
        mov     qword [rbx], rax
        add     rsp, 8
        mov     rax, rbx
        pop     rbx
        pop     rbp
        ret


ALIGN   16

string_length:
        mov     rax, qword [rdi]
        ret


ALIGN   16

string_substring:
        push    r15
        push    r14
        push    r13
        movsxd  r13, esi
        push    r12
        mov     r12d, edx
        sub     r12d, r13d
        push    rbp
        mov     rbp, rdi
        lea     edi, [r12+0AH]
        push    rbx
        lea     ebx, [r12+1H]
        movsxd  rdi, edi
        sub     rsp, 8
        call    malloc
        movsxd  rdx, ebx
        test    ebx, ebx
        mov     qword [rax], rdx
        jle     L_018
        lea     edi, [r13+8H]
        add     r13, rbp
        lea     rcx, [rax+18H]
        lea     rdx, [r13+8H]
        lea     rsi, [r13+18H]
        cmp     rcx, rdx
        lea     rdx, [rax+8H]
        setbe   cl
        cmp     rsi, rdx
        setbe   dl
        or      cl, dl
        je      L_019
        cmp     ebx, 15
        jbe     L_019
        mov     esi, ebx
        xor     edx, edx
        xor     r8d, r8d
        shr     esi, 4
        mov     ecx, esi
        shl     ecx, 4
L_017:  movdqu  xmm0, oword [r13+rdx+8H]
        add     r8d, 1
        movdqu  oword [rax+rdx+8H], xmm0
        add     rdx, 16
        cmp     r8d, esi
        jc      L_017
        cmp     ebx, ecx
        je      L_018
        lea     edx, [rdi+rcx]
        lea     r13d, [rcx+8H]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r13d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+1H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r11d, [rcx+9H]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r11d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+2H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r10d, [rcx+0AH]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r10d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+3H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r9d, [rcx+0BH]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r9d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+4H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r8d, [rcx+0CH]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r8d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+5H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     esi, [rcx+0DH]
        movsxd  rdx, edx
        movzx   r14d, byte [rbp+rdx]
        movsxd  rdx, esi
        mov     byte [rax+rdx], r14b
        lea     edx, [rcx+6H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        movsxd  rdx, edx
        movzx   r15d, byte [rbp+rdx]
        lea     edx, [rcx+0EH]
        movsxd  r14, edx
        mov     byte [rax+r14], r15b
        lea     r14d, [rcx+7H]
        cmp     ebx, r14d
        jle     L_018
        add     r14d, edi
        cmp     ebx, r13d
        movsxd  r14, r14d
        movzx   r15d, byte [rbp+r14]
        lea     r14d, [rcx+0FH]
        movsxd  r14, r14d
        mov     byte [rax+r14], r15b
        jle     L_018
        add     r13d, edi
        cmp     ebx, r11d
        movsxd  r13, r13d
        movzx   r14d, byte [rbp+r13]
        lea     r13d, [rcx+10H]
        movsxd  r13, r13d
        mov     byte [rax+r13], r14b
        jle     L_018
        add     r11d, edi
        cmp     ebx, r10d
        movsxd  r11, r11d
        movzx   r13d, byte [rbp+r11]
        lea     r11d, [rcx+11H]
        movsxd  r11, r11d
        mov     byte [rax+r11], r13b
        jle     L_018
        add     r10d, edi
        cmp     ebx, r9d
        movsxd  r10, r10d
        movzx   r11d, byte [rbp+r10]
        lea     r10d, [rcx+12H]
        movsxd  r10, r10d
        mov     byte [rax+r10], r11b
        jle     L_018
        add     r9d, edi
        cmp     ebx, r8d
        movsxd  r9, r9d
        movzx   r10d, byte [rbp+r9]
        lea     r9d, [rcx+13H]
        movsxd  r9, r9d
        mov     byte [rax+r9], r10b
        jle     L_018
        add     r8d, edi
        cmp     ebx, esi
        movsxd  r8, r8d
        movzx   r9d, byte [rbp+r8]
        lea     r8d, [rcx+14H]
        movsxd  r8, r8d
        mov     byte [rax+r8], r9b
        jle     L_018
        add     esi, edi
        cmp     ebx, edx
        movsxd  rsi, esi
        movzx   r8d, byte [rbp+rsi]
        lea     esi, [rcx+15H]
        movsxd  rsi, esi
        mov     byte [rax+rsi], r8b
        jle     L_018
        add     edx, edi
        add     ecx, 22
        movsxd  rdx, edx
        movsxd  rcx, ecx
        movzx   edx, byte [rbp+rdx]
        mov     byte [rax+rcx], dl
L_018:  add     r12d, 9
        movsxd  r12, r12d
        mov     byte [rax+r12], 0
        add     rsp, 8
        pop     rbx
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        pop     r15
        ret


ALIGN   16
L_019:  movsxd  rdi, edi
        xor     ecx, ecx
        add     rbp, rdi


ALIGN   16
L_020:  movzx   edx, byte [rbp+rcx]
        mov     byte [rax+rcx+8H], dl
        add     rcx, 1
        cmp     ebx, ecx
        jg      L_020
        jmp     L_018


ALIGN   16

string_parseInt:
        movsx   edx, byte [rdi+8H]
        cmp     dl, 45
        jz      L_024
        lea     rcx, [rdi+8H]
        xor     edi, edi
L_021:  lea     eax, [rdx-30H]
        cmp     al, 9
        mov     eax, 0
        ja      L_023


ALIGN   8
L_022:  sub     edx, 48
        lea     rax, [rax+rax*4]
        add     rcx, 1
        movsxd  rdx, edx
        lea     rax, [rdx+rax*2]
        movsx   edx, byte [rcx]
        lea     esi, [rdx-30H]
        cmp     sil, 9
        jbe     L_022
L_023:  mov     rdx, rax
        neg     rdx
        test    edi, edi
        cmovne  rax, rdx
        ret


ALIGN   8
L_024:  lea     rcx, [rdi+9H]
        movsx   edx, byte [rdi+9H]
        mov     edi, 1
        jmp     L_021


        nop

ALIGN   16
string_ord:
        movsx   rax, byte [rdi+rsi+8H]
        ret


ALIGN   16

string_strcat:
        push    r15
        push    r14
        push    r13
        push    r12
        mov     r12, rsi
        push    rbp
        mov     rbp, rdi
        push    rbx
        sub     rsp, 8
        mov     rbx, qword [rdi]
        mov     r13, qword [rsi]
        lea     r14, [rbx+r13]
        lea     rdi, [r14+9H]
        call    malloc
        test    rbx, rbx
        mov     qword [rax], r14
        jle     L_026
        lea     rcx, [rbp+8H]
        lea     rdx, [rax+18H]
        lea     rsi, [rbp+18H]
        cmp     rcx, rdx
        lea     rdx, [rax+8H]
        setae   cl
        cmp     rsi, rdx
        setbe   dl
        or      cl, dl
        je      L_029
        cmp     rbx, 15
        jbe     L_029
        mov     rsi, rbx
        xor     ecx, ecx
        xor     edi, edi
        shr     rsi, 4
        mov     rdx, rsi
        shl     rdx, 4
L_025:  movdqu  xmm0, oword [rbp+rcx+8H]
        add     rdi, 1
        movdqu  oword [rax+rcx+8H], xmm0
        add     rcx, 16
        cmp     rsi, rdi
        ja      L_025
        cmp     rbx, rdx
        je      L_026
        lea     r14d, [rdx+8H]
        movsxd  r14, r14d
        movzx   ecx, byte [rbp+r14]
        mov     byte [rax+r14], cl
        lea     ecx, [rdx+1H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     r10d, [rdx+9H]
        movsxd  rcx, r10d
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+2H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     r9d, [rdx+0AH]
        movsxd  rcx, r9d
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+3H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     r8d, [rdx+0BH]
        movsxd  rcx, r8d
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+4H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     edi, [rdx+0CH]
        movsxd  rcx, edi
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+5H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     esi, [rdx+0DH]
        movsxd  rcx, esi
        movzx   r11d, byte [rbp+rcx]
        mov     byte [rax+rcx], r11b
        lea     ecx, [rdx+6H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     ecx, [rdx+0EH]
        movsxd  r11, ecx
        movzx   r15d, byte [rbp+r11]
        mov     byte [rax+r11], r15b
        lea     r11d, [rdx+7H]
        movsxd  r11, r11d
        cmp     rbx, r11
        jle     L_026
        lea     r11d, [rdx+0FH]
        cmp     rbx, r14
        movsxd  r11, r11d
        movzx   r15d, byte [rbp+r11]
        mov     byte [rax+r11], r15b
        jle     L_026
        lea     r11d, [rdx+10H]
        movsxd  r10, r10d
        cmp     rbx, r10
        movsxd  r11, r11d
        movzx   r14d, byte [rbp+r11]
        mov     byte [rax+r11], r14b
        jle     L_026
        lea     r10d, [rdx+11H]
        movsxd  r9, r9d
        cmp     rbx, r9
        movsxd  r10, r10d
        movzx   r11d, byte [rbp+r10]
        mov     byte [rax+r10], r11b
        jle     L_026
        lea     r9d, [rdx+12H]
        movsxd  r8, r8d
        cmp     rbx, r8
        movsxd  r9, r9d
        movzx   r10d, byte [rbp+r9]
        mov     byte [rax+r9], r10b
        jle     L_026
        lea     r8d, [rdx+13H]
        movsxd  rdi, edi
        cmp     rbx, rdi
        movsxd  r8, r8d
        movzx   r9d, byte [rbp+r8]
        mov     byte [rax+r8], r9b
        jle     L_026
        lea     edi, [rdx+14H]
        movsxd  rsi, esi
        cmp     rbx, rsi
        movsxd  rdi, edi
        movzx   r8d, byte [rbp+rdi]
        mov     byte [rax+rdi], r8b
        jle     L_026
        lea     esi, [rdx+15H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        movsxd  rsi, esi
        movzx   edi, byte [rbp+rsi]
        mov     byte [rax+rsi], dil
        jle     L_026
        add     edx, 22
        movsxd  rdx, edx
        movzx   ecx, byte [rbp+rdx]
        mov     byte [rax+rdx], cl
L_026:  test    r13, r13
        jle     L_031
        lea     rsi, [r13+1H]
        add     rbx, 8
        mov     edx, 1
        xor     ecx, ecx


ALIGN   8
L_027:  movzx   edi, byte [r12+rdx+7H]
        add     rcx, rax
        mov     byte [rcx+rbx], dil
        mov     rcx, rdx
        add     rdx, 1
        cmp     rdx, rsi
        jnz     L_027
L_028:  add     r13, rax
        mov     byte [r13+rbx], 0
        add     rsp, 8
        pop     rbx
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        pop     r15
        ret


ALIGN   8
L_029:  xor     edx, edx


ALIGN   8
L_030:  movzx   ecx, byte [rbp+rdx+8H]
        mov     byte [rax+rdx+8H], cl
        add     rdx, 1
        cmp     rbx, rdx
        jnz     L_030
        jmp     L_026

L_031:  add     rbx, 8
        jmp     L_028


ALIGN   16

string_compare:
        sub     rsp, 8
        add     rsi, 8
        add     rdi, 8
        call    strcmp
        add     rsp, 8
        cdqe
        ret


SECTION .bss    align=32

__buffer.3442:
        resb    1048576



SECTION .text

___init:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov qword [rel V_A_0], 48271
        mov qword [rel V_M_0], 2147483647
        mov qword [rel V_seed_0], 1
        mov rsp, rbp
        pop rbp
        ret 

random:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rdx
        mov rax, qword [rel V_A_0]
        imul rcx
        mov rsi, rax
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rax
        mov rax, qword [rel V_R_0]
        imul rcx
        mov rcx, rax
        mov rax, rsi
        sub rax, rcx
        mov rax, rax
        cmp rax, 0
        jl label_6
        mov qword [rel V_seed_0], rax
label_5:
        mov rax, qword [rel V_seed_0]
        mov rsp, rbp
        pop rbp
        ret 
label_6:
        mov rax, rax
        add rax, qword [rel V_M_0]
        mov qword [rel V_seed_0], rax
        jmp label_5

initialize:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rcx, rdi
        mov qword [rel V_seed_0], rcx
        mov rsp, rbp
        pop rbp
        ret 

swap:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rdx, rdi
        mov rsi, rsi
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdx*8+8]
        mov rdi, qword [rcx]
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdx*8+8]
        mov rdx, qword [rel A_a_0]
        lea rdx, [rdx+rsi*8+8]
        mov rdx, qword [rdx]
        mov qword [rcx], rdx
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rsi*8+8]
        mov qword [rcx], rdi
        mov rsp, rbp
        pop rbp
        ret 

pd:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsi, rdi
label_13:
        mov rax, qword [rel V_h_0]
        cmp rax, rsi
        jg label_14
        mov rcx, qword [rel V_h_0]
        inc rcx
        mov rax, qword [rel V_h_0]
        imul rcx
        mov rax, rax
        mov rax, rax
        mov rcx, 1
        sar rax, cl
        cmp rsi, rax
        je label_17
        mov rax, qword [rel V_h_0]
        inc rax
        mov qword [rel V_h_0], rax
        jmp label_13
label_17:
        mov rax, 1
label_12:
        mov rsp, rbp
        pop rbp
        ret 
label_14:
        mov rax, 0
        jmp label_12

show:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push rbx
        mov rbx, 0
label_25:
        cmp rbx, qword [rel V_now_0]
        jl label_27
        mov rdi, S_1
        call println
        pop rbx
        mov rsp, rbp
        pop rbp
        ret 
label_27:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rbx*8+8]
        mov rdi, qword [rax]
        call toString
        mov rax, rax
        mov rsi, S_0
        mov rdi, rax
        call string_strcat
        mov rax, rax
        mov rdi, rax
        call print
        inc rbx
        jmp label_25

win:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rdi, 808
        call malloc
        mov rax, rax
        mov qword [rax], 100
        mov rdx, rax
        mov rax, qword [rel V_now_0]
        cmp rax, qword [rel V_h_0]
        je label_32
        mov rax, 0
label_30:
        mov rsp, rbp
        pop rbp
        ret 
label_32:
        mov rdi, 0
label_35:
        cmp rdi, qword [rel V_now_0]
        jl label_37
        mov rsi, 0
label_39:
        mov rax, qword [rel V_now_0]
        sub rax, 1
        cmp rsi, rax
        jl label_41
        mov rsi, 0
label_49:
        cmp rsi, qword [rel V_now_0]
        jl label_51
        mov rax, 1
        jmp label_30
label_51:
        lea rax, [rdx+rsi*8+8]
        mov rcx, rsi
        inc rcx
        mov rax, qword [rax]
        cmp rax, rcx
        je label_54
        mov rax, 0
        jmp label_30
label_54:
        inc rsi
        jmp label_49
label_41:
        mov rax, rsi
        inc rax
        mov rdi, rax
label_43:
        cmp rdi, qword [rel V_now_0]
        jl label_45
        inc rsi
        jmp label_39
label_45:
        lea rcx, [rdx+rsi*8+8]
        lea rax, [rdx+rdi*8+8]
        mov rcx, qword [rcx]
        cmp rcx, qword [rax]
        jg label_47
label_48:
        inc rdi
        jmp label_43
label_47:
        lea rax, [rdx+rsi*8+8]
        mov rax, qword [rax]
        lea r8, [rdx+rsi*8+8]
        lea rcx, [rdx+rdi*8+8]
        mov rcx, qword [rcx]
        mov qword [r8], rcx
        lea rcx, [rdx+rdi*8+8]
        mov qword [rcx], rax
        jmp label_48
label_37:
        lea rax, [rdx+rdi*8+8]
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdi*8+8]
        mov rcx, qword [rcx]
        mov qword [rax], rcx
        inc rdi
        jmp label_35

merge:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsi, 0
label_61:
        cmp rsi, qword [rel V_now_0]
        jl label_63
        mov rsi, 0
label_74:
        cmp rsi, qword [rel V_now_0]
        jl label_76
label_75:
        mov rsp, rbp
        pop rbp
        ret 
label_76:
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rsi*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_78
        inc rsi
        jmp label_74
label_78:
        mov qword [rel V_now_0], rsi
        jmp label_75
label_63:
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rsi*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_65
label_66:
        inc rsi
        jmp label_61
label_65:
        mov rcx, rsi
        inc rcx
        mov rdx, rcx
label_67:
        cmp rdx, qword [rel V_now_0]
        jl label_69
label_68:
        jmp label_66
label_69:
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdx*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_72
        mov rdi, rsi
        mov rdx, rdx
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdi*8+8]
        mov r8, qword [rcx]
        mov rcx, qword [rel A_a_0]
        lea rdi, [rcx+rdi*8+8]
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdx*8+8]
        mov rcx, qword [rcx]
        mov qword [rdi], rcx
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rdx*8+8]
        mov qword [rcx], r8
        jmp label_68
label_72:
        inc rdx
        jmp label_67

move:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsi, 0
label_82:
        cmp rsi, qword [rel V_now_0]
        jl label_84
        mov rdx, qword [rel A_a_0]
        mov rcx, qword [rel V_now_0]
        lea rcx, [rdx+rcx*8+8]
        mov rdx, qword [rel V_now_0]
        mov qword [rcx], rdx
        mov rcx, qword [rel V_now_0]
        inc rcx
        mov qword [rel V_now_0], rcx
        mov rsp, rbp
        pop rbp
        ret 
label_84:
        mov rcx, qword [rel A_a_0]
        lea rcx, [rcx+rsi*8+8]
        mov rdx, qword [rcx]
        sub rdx, 1
        mov qword [rcx], rdx
        mov rcx, rsi
        inc rcx
        mov rsi, rcx
        jmp label_82

main:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push r14
        push r12
        push rbx
        call ___init
        mov r12, 0
        mov r14, 0
        mov rbx, 0
        mov qword [rel V_n_0], 210
        mov qword [rel V_h_0], 0
        mov rdi, 808
        call malloc
        mov rax, rax
        mov qword [rax], 100
        mov qword [rel A_a_0], rax
        mov rax, qword [rel V_M_0]
        cdq 
        mov rcx, qword [rel V_A_0]
        idiv rcx
        mov rax, rax
        mov qword [rel V_Q_0], rax
        mov rax, qword [rel V_M_0]
        cdq 
        mov rcx, qword [rel V_A_0]
        idiv rcx
        mov rax, rdx
        mov qword [rel V_R_0], rax
        mov rsi, qword [rel V_n_0]
label_90:
        mov rax, qword [rel V_h_0]
        cmp rax, rsi
        jg label_91
        mov rcx, qword [rel V_h_0]
        inc rcx
        mov rax, qword [rel V_h_0]
        imul rcx
        mov rax, rax
        mov rax, rax
        mov rcx, 1
        sar rax, cl
        cmp rsi, rax
        je label_94
        mov rax, qword [rel V_h_0]
        inc rax
        mov qword [rel V_h_0], rax
        jmp label_90
label_94:
        mov rax, 1
label_89:
        cmp rax, 1
        je label_88
        mov rdi, S_2
        call println
        mov rax, 1
label_86:
        pop rbx
        pop r12
        pop r14
        mov rsp, rbp
        pop rbp
        ret 
label_88:
        mov rdi, S_3
        call println
        mov rax, 3654898
        mov qword [rel V_seed_0], rax
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rdx
        mov rax, qword [rel V_A_0]
        imul rcx
        mov rcx, rax
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rsi, qword [rel V_Q_0]
        idiv rsi
        mov rdx, rax
        mov rax, qword [rel V_R_0]
        imul rdx
        mov rsi, rax
        mov rax, rcx
        sub rax, rsi
        mov rax, rax
        cmp rax, 0
        jl label_104
        mov qword [rel V_seed_0], rax
label_103:
        mov rax, qword [rel V_seed_0]
        mov rax, rax
        cdq 
        mov rcx, 10
        idiv rcx
        mov rax, rdx
        mov rax, rax
        inc rax
        mov qword [rel V_now_0], rax
        mov rdi, qword [rel V_now_0]
        call toString
        mov rax, rax
        mov rdi, rax
        call println
label_105:
        mov rax, qword [rel V_now_0]
        sub rax, 1
        cmp r12, rax
        jl label_107
        mov rcx, qword [rel V_now_0]
        sub rcx, 1
        mov rax, qword [rel A_a_0]
        lea rcx, [rax+rcx*8+8]
        mov rax, qword [rel V_n_0]
        sub rax, r14
        mov qword [rcx], rax
        mov r12, 0
label_121:
        cmp r12, qword [rel V_now_0]
        jl label_123
        mov rdi, S_5
        call println
        mov rcx, 0
label_126:
        cmp rcx, qword [rel V_now_0]
        jl label_128
        mov rcx, 0
label_139:
        cmp rcx, qword [rel V_now_0]
        jl label_141
label_140:
label_145:
        call win
        mov rax, rax
        cmp rax, 1
        je label_147
        inc rbx
        mov rdi, rbx
        call toString
        mov rax, rax
        mov rsi, rax
        mov rdi, S_6
        call string_strcat
        mov rax, rax
        mov rsi, S_7
        mov rdi, rax
        call string_strcat
        mov rax, rax
        mov rdi, rax
        call println
        mov rcx, 0
label_149:
        cmp rcx, qword [rel V_now_0]
        jl label_151
        mov rcx, qword [rel A_a_0]
        mov rax, qword [rel V_now_0]
        lea rax, [rcx+rax*8+8]
        mov rcx, qword [rel V_now_0]
        mov qword [rax], rcx
        mov rax, qword [rel V_now_0]
        inc rax
        mov qword [rel V_now_0], rax
        mov rcx, 0
label_153:
        cmp rcx, qword [rel V_now_0]
        jl label_155
        mov rcx, 0
label_166:
        cmp rcx, qword [rel V_now_0]
        jl label_168
label_167:
        mov r12, 0
label_173:
        cmp r12, qword [rel V_now_0]
        jl label_175
        mov rdi, S_9
        call println
        jmp label_145
label_175:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+r12*8+8]
        mov rdi, qword [rax]
        call toString
        mov rax, rax
        mov rsi, S_8
        mov rdi, rax
        call string_strcat
        mov rax, rax
        mov rdi, rax
        call print
        inc r12
        jmp label_173
label_168:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_170
        inc rcx
        jmp label_166
label_170:
        mov qword [rel V_now_0], rcx
        jmp label_167
label_155:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_157
label_158:
        inc rcx
        jmp label_153
label_157:
        mov rax, rcx
        inc rax
        mov rdx, rax
label_159:
        cmp rdx, qword [rel V_now_0]
        jl label_161
label_160:
        jmp label_158
label_161:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rdx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_164
        mov rsi, rcx
        mov rdi, rdx
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rsi*8+8]
        mov rdx, qword [rax]
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rsi*8+8]
        mov rsi, qword [rel A_a_0]
        lea rsi, [rsi+rdi*8+8]
        mov rsi, qword [rsi]
        mov qword [rax], rsi
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rdi*8+8]
        mov qword [rax], rdx
        jmp label_160
label_164:
        inc rdx
        jmp label_159
label_151:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rcx*8+8]
        mov rdx, qword [rax]
        sub rdx, 1
        mov qword [rax], rdx
        mov rax, rcx
        inc rax
        mov rcx, rax
        jmp label_149
label_147:
        mov rdi, rbx
        call toString
        mov rax, rax
        mov rsi, rax
        mov rdi, S_10
        call string_strcat
        mov rax, rax
        mov rsi, S_11
        mov rdi, rax
        call string_strcat
        mov rax, rax
        mov rdi, rax
        call println
        mov rax, 0
        jmp label_86
label_141:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_143
        inc rcx
        jmp label_139
label_143:
        mov qword [rel V_now_0], rcx
        jmp label_140
label_128:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_130
label_131:
        inc rcx
        jmp label_126
label_130:
        mov rax, rcx
        inc rax
        mov rdx, rax
label_132:
        cmp rdx, qword [rel V_now_0]
        jl label_134
label_133:
        jmp label_131
label_134:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rdx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_137
        mov rsi, rcx
        mov rdi, rdx
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rsi*8+8]
        mov rdx, qword [rax]
        mov rax, qword [rel A_a_0]
        lea rsi, [rax+rsi*8+8]
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rdi*8+8]
        mov rax, qword [rax]
        mov qword [rsi], rax
        mov rax, qword [rel A_a_0]
        lea rax, [rax+rdi*8+8]
        mov qword [rax], rdx
        jmp label_133
label_137:
        inc rdx
        jmp label_132
label_123:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+r12*8+8]
        mov rdi, qword [rax]
        call toString
        mov rax, rax
        mov rsi, S_4
        mov rdi, rax
        call string_strcat
        mov rax, rax
        mov rdi, rax
        call print
        inc r12
        jmp label_121
label_107:
        mov rax, qword [rel A_a_0]
        lea rsi, [rax+r12*8+8]
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rdx
        mov rax, qword [rel V_A_0]
        imul rcx
        mov rdi, rax
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rax
        mov rax, qword [rel V_R_0]
        imul rcx
        mov rax, rax
        mov rcx, rdi
        sub rcx, rax
        mov rax, rcx
        cmp rax, 0
        jl label_112
        mov qword [rel V_seed_0], rax
label_111:
        mov rax, qword [rel V_seed_0]
        mov rax, rax
        cdq 
        mov rcx, 10
        idiv rcx
        mov rax, rdx
        mov rax, rax
        inc rax
        mov qword [rsi], rax
label_113:
        mov rax, qword [rel A_a_0]
        lea rax, [rax+r12*8+8]
        mov rax, qword [rax]
        add rax, r14
        cmp rax, qword [rel V_n_0]
        jg label_114
        mov rax, qword [rel A_a_0]
        lea rcx, [rax+r12*8+8]
        mov rax, r14
        add rax, qword [rcx]
        mov r14, rax
        inc r12
        jmp label_105
label_114:
        mov rax, qword [rel A_a_0]
        lea rsi, [rax+r12*8+8]
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rdx
        mov rax, qword [rel V_A_0]
        imul rcx
        mov rdi, rax
        mov rax, qword [rel V_seed_0]
        cdq 
        mov rcx, qword [rel V_Q_0]
        idiv rcx
        mov rcx, rax
        mov rax, qword [rel V_R_0]
        imul rcx
        mov rax, rax
        mov rcx, rdi
        sub rcx, rax
        mov rax, rcx
        cmp rax, 0
        jl label_119
        mov qword [rel V_seed_0], rax
label_118:
        mov rax, qword [rel V_seed_0]
        mov rax, rax
        cdq 
        mov rcx, 10
        idiv rcx
        mov rax, rdx
        mov rax, rax
        inc rax
        mov qword [rsi], rax
        jmp label_113
label_119:
        mov rax, rax
        add rax, qword [rel V_M_0]
        mov qword [rel V_seed_0], rax
        jmp label_118
label_112:
        mov rax, rax
        add rax, qword [rel V_M_0]
        mov qword [rel V_seed_0], rax
        jmp label_111
label_104:
        mov rax, rax
        add rax, qword [rel V_M_0]
        mov qword [rel V_seed_0], rax
        jmp label_103
label_91:
        mov rax, 0
        jmp label_89



SECTION .data    align=8



SECTION .bss     align=8
V_n_0:
         resq 1
V_h_0:
         resq 1
V_now_0:
         resq 1
A_a_0:
         resq 1
V_A_0:
         resq 1
V_M_0:
         resq 1
V_Q_0:
         resq 1
V_R_0:
         resq 1
V_seed_0:
         resq 1

SECTION .rodata
S_1: 
         dq 0
         db 00H
S_0: 
         dq 1
         db 20H, 00H
S_3: 
         dq 12
         db 4CH, 65H, 74H, 27H, 73H, 20H, 73H, 74H, 61H, 72H, 74H, 21H, 00H
S_2: 
         dq 79
         db 53H, 6FH, 72H, 72H, 79H, 2CH, 20H, 74H, 68H, 65H, 20H, 6EH, 75H, 6DH, 62H, 65H, 72H, 20H, 6EH, 20H, 6DH, 75H, 73H, 74H, 20H, 62H, 65H, 20H, 61H, 20H, 6EH, 75H, 6DH, 62H, 65H, 72H, 20H, 73H, 2EH, 74H, 2EH, 20H, 74H, 68H, 65H, 72H, 65H, 20H, 65H, 78H, 69H, 73H, 74H, 73H, 20H, 69H, 20H, 73H, 61H, 74H, 69H, 73H, 66H, 79H, 69H, 6EH, 67H, 20H, 6EH, 3DH, 31H, 2BH, 32H, 2BH, 2EH, 2EH, 2EH, 2BH, 69H, 00H
S_5: 
         dq 0
         db 00H
S_4: 
         dq 1
         db 20H, 00H
S_7: 
         dq 1
         db 3AH, 00H
S_6: 
         dq 5
         db 73H, 74H, 65H, 70H, 20H, 00H
S_11: 
         dq 8
         db 20H, 73H, 74H, 65H, 70H, 28H, 73H, 29H, 00H
S_9: 
         dq 0
         db 00H
S_10: 
         dq 7
         db 54H, 6FH, 74H, 61H, 6CH, 3AH, 20H, 00H
S_8: 
         dq 1
         db 20H, 00H

L_033:
        db 25H, 6CH, 64H, 00H

L_032:
        db 25H, 73H, 00H



