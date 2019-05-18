default rel

global V_INF_0
global V_nMax_0
global V_n_0
global V_m_0
global V_id_cnt_0
global A_din_0
global A_sp_0
global A_dintree_0
global A_char_ID_0
global ___init
global max
global Node_copy
global Node_init
global Node_judge
global Node_push_up
global Node_addtag_ch
global Node_addtag_ro
global Node_push_down
global Node_rot
global Node_rotto
global Node_Node
global splay_tree_build
global splay_tree_build_tree
global splay_tree_find
global splay_tree_dfs
global splay_tree_del
global splay_tree_change
global splay_tree_rol
global splay_tree_getsum
global splay_tree_getMax
global splay_tree_splay_tree
global equ
global merge
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
        mov qword [rel V_INF_0], 1000000000
        mov qword [rel V_nMax_0], 4000010
        mov qword [rel V_id_cnt_0], 0
        mov rax, qword [rel V_nMax_0]
        mov rcx, 3
        sal rax, cl
        add rax, 8
        mov rdi, rax
        call malloc
        mov rdx, rax
        mov rcx, qword [rel V_nMax_0]
        mov qword [rdx], rcx
        mov qword [rel A_din_0], rdx
        mov qword [rel A_char_ID_0], S_0
        mov rsp, rbp
        pop rbp
        ret 

max:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rcx, rdi
        mov rax, rsi
        cmp rcx, rax
        jg label_4
        mov rax, rax
label_3:
        mov rsp, rbp
        pop rbp
        ret 
label_4:
        mov rax, rcx
        jmp label_3

Node_copy:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rdx, rdi
        mov rsi, rsi
        lea rcx, [rsi+0*8]
        mov rcx, qword [rcx]
        mov qword [rdx+0*8], rcx
        lea rcx, [rsi+1*8]
        mov rcx, qword [rcx]
        mov qword [rdx+1*8], rcx
        lea rcx, [rsi+2*8]
        mov rcx, qword [rcx]
        mov qword [rdx+2*8], rcx
        lea rcx, [rsi+3*8]
        mov rcx, qword [rcx]
        mov qword [rdx+3*8], rcx
        lea rcx, [rsi+4*8]
        mov rcx, qword [rcx]
        mov qword [rdx+4*8], rcx
        lea rcx, [rsi+5*8]
        mov rcx, qword [rcx]
        mov qword [rdx+5*8], rcx
        lea rcx, [rsi+6*8]
        mov rcx, qword [rcx]
        mov qword [rdx+6*8], rcx
        lea rcx, [rsi+7*8]
        mov rcx, qword [rcx]
        mov qword [rdx+7*8], rcx
        lea rcx, [rsi+8*8]
        mov rcx, qword [rcx]
        mov qword [rdx+8*8], rcx
        lea rcx, [rsi+9*8]
        mov rcx, qword [rcx]
        mov qword [rdx+9*8], rcx
        mov rcx, qword [rdx+10*8]
        lea rdi, [rcx+0*8+8]
        lea rcx, [rsi+10*8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+0*8+8]
        mov rcx, qword [rcx]
        mov qword [rdi], rcx
        mov rcx, qword [rdx+10*8]
        lea rdi, [rcx+1*8+8]
        lea rcx, [rsi+10*8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+1*8+8]
        mov rcx, qword [rcx]
        mov qword [rdi], rcx
        lea rcx, [rsi+11*8]
        mov rcx, qword [rcx]
        mov qword [rdx+11*8], rcx
        mov rsp, rbp
        pop rbp
        ret 

Node_init:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push r15
        mov r15, rdi
        mov rcx, rsi
        mov rax, rdx
        mov qword [r15+0*8], rax
        mov qword [r15+2*8], 1
        mov qword [r15+4*8], 0
        mov qword [r15+6*8], 0
        mov qword [r15+5*8], 0
        mov qword [r15+3*8], rcx
        mov qword [r15+1*8], rcx
        mov qword [r15+7*8], rcx
        mov qword [r15+8*8], rcx
        mov qword [r15+9*8], rcx
        mov rdi, 24
        call malloc
        mov rcx, rax
        mov qword [rcx], 2
        mov qword [r15+10*8], rcx
        mov rcx, qword [r15+10*8]
        lea rcx, [rcx+0*8+8]
        mov qword [rcx], 0
        mov rcx, qword [r15+10*8]
        lea rcx, [rcx+1*8+8]
        mov qword [rcx], 0
        mov qword [r15+11*8], 0
        pop r15
        mov rsp, rbp
        pop rbp
        ret 

Node_judge:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rcx, rdi
        mov rax, rsi
        mov rcx, qword [rcx+10*8]
        lea rcx, [rcx+0*8+8]
        mov rcx, qword [rcx]
        mov rax, rax
        cmp rcx, 0
        je label_16
        cmp rax, 0
        je label_24
        lea rcx, [rcx+0*8]
        lea rdx, [rax+0*8]
        mov rax, qword [rcx]
        cmp rax, qword [rdx]
        je label_28
        mov rax, 0
label_15:
        cmp rax, 1
        je label_12
        mov rax, 1
label_11:
        mov rsp, rbp
        pop rbp
        ret 
label_12:
        mov rax, 0
        jmp label_11
label_28:
        mov rax, 1
        jmp label_15
label_24:
        mov rax, 0
        jmp label_15
label_16:
        cmp rax, 0
        je label_18
        mov rax, 0
        jmp label_15
label_18:
        mov rax, 1
        jmp label_15

Node_push_up:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsi, rdi
        mov qword [rsi+2*8], 1
        mov rcx, qword [rsi+1*8]
        mov qword [rsi+3*8], rcx
        mov rcx, 0
label_32:
        cmp rcx, 2
        jl label_34
        mov rcx, qword [rsi+1*8]
        mov qword [rsi+7*8], rcx
        mov rcx, qword [rsi+1*8]
        mov qword [rsi+8*8], rcx
        mov rcx, qword [rsi+1*8]
        mov qword [rsi+9*8], rcx
        mov rdi, qword [rsi+1*8]
        mov r8, qword [rsi+1*8]
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+0*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_39
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+0*8+8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+7*8]
        mov rcx, qword [rcx]
        mov qword [rsi+7*8], rcx
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+0*8+8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+3*8]
        mov rdx, rdi
        add rdx, qword [rcx]
        mov rdi, rdx
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+0*8+8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+8*8]
        mov rdx, qword [rcx]
        mov r9, 0
        cmp rdx, r9
        jg label_41
        mov rdx, r9
label_40:
        mov rcx, r8
        add rcx, rdx
        mov r8, rcx
label_39:
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+1*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_44
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+1*8+8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+8*8]
        mov rcx, qword [rcx]
        mov qword [rsi+8*8], rcx
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+1*8+8]
        mov rcx, qword [rcx]
        lea rdx, [rcx+3*8]
        mov rcx, r8
        add rcx, qword [rdx]
        mov r8, rcx
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+1*8+8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+7*8]
        mov rdx, qword [rcx]
        mov r9, 0
        cmp rdx, r9
        jg label_46
        mov rdx, r9
label_45:
        mov rcx, rdi
        add rcx, rdx
        mov rdi, rcx
label_44:
        mov rdx, qword [rsi+7*8]
        mov r9, rdi
        cmp rdx, r9
        jg label_49
        mov rcx, r9
label_48:
        mov qword [rsi+7*8], rcx
        mov rdx, qword [rsi+8*8]
        mov r9, r8
        cmp rdx, r9
        jg label_52
        mov rcx, r9
label_51:
        mov qword [rsi+8*8], rcx
        mov rcx, 0
label_54:
        cmp rcx, 2
        jl label_56
        mov rcx, qword [rsi+1*8]
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+0*8+8]
        mov rdx, qword [rdx]
        cmp rdx, 0
        je label_64
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+0*8+8]
        mov rdx, qword [rdx]
        lea rdx, [rdx+8*8]
        mov rdx, qword [rdx]
        mov r9, 0
        cmp rdx, r9
        jg label_66
        mov rdx, r9
label_65:
        mov rcx, rcx
        add rcx, rdx
        mov rcx, rcx
label_64:
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+1*8+8]
        mov rdx, qword [rdx]
        cmp rdx, 0
        je label_69
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+1*8+8]
        mov rdx, qword [rdx]
        lea rdx, [rdx+7*8]
        mov rdx, qword [rdx]
        mov r9, 0
        cmp rdx, r9
        jg label_71
        mov rdx, r9
label_70:
        mov rcx, rcx
        add rcx, rdx
        mov rcx, rcx
label_69:
        mov rdx, qword [rsi+9*8]
        mov r9, rcx
        cmp rdx, r9
        jg label_74
        mov rcx, r9
label_73:
        mov qword [rsi+9*8], rcx
        mov rsp, rbp
        pop rbp
        ret 
label_74:
        mov rcx, rdx
        jmp label_73
label_71:
        mov rdx, rdx
        jmp label_70
label_66:
        mov rdx, rdx
        jmp label_65
label_56:
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+rcx*8+8]
        mov rdx, qword [rdx]
        cmp rdx, 0
        je label_59
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+rcx*8+8]
        mov rdx, qword [rdx]
        lea rdi, [rdx+9*8]
        mov rdx, qword [rsi+9*8]
        mov r9, qword [rdi]
        cmp rdx, r9
        jg label_61
        mov rdx, r9
label_60:
        mov qword [rsi+9*8], rdx
label_59:
        inc rcx
        jmp label_54
label_61:
        mov rdx, rdx
        jmp label_60
label_52:
        mov rcx, rdx
        jmp label_51
label_49:
        mov rcx, rdx
        jmp label_48
label_46:
        mov rdx, rdx
        jmp label_45
label_41:
        mov rdx, rdx
        jmp label_40
label_34:
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+rcx*8+8]
        mov rdx, qword [rdx]
        cmp rdx, 0
        je label_37
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+rcx*8+8]
        mov rdx, qword [rdx]
        lea rdx, [rdx+2*8]
        mov rdi, qword [rsi+2*8]
        add rdi, qword [rdx]
        mov qword [rsi+2*8], rdi
        mov rdx, qword [rsi+10*8]
        lea rdx, [rdx+rcx*8+8]
        mov rdx, qword [rdx]
        lea rdi, [rdx+3*8]
        mov rdx, qword [rsi+3*8]
        add rdx, qword [rdi]
        mov qword [rsi+3*8], rdx
label_37:
        inc rcx
        jmp label_32

Node_addtag_ch:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rdi, rdi
        mov rsi, rsi
        mov qword [rdi+1*8], rsi
        mov rax, qword [rdi+2*8]
        imul rsi
        mov rcx, rax
        mov qword [rdi+3*8], rcx
        cmp rsi, 0
        jl label_80
        mov rcx, qword [rdi+3*8]
        mov qword [rdi+7*8], rcx
        mov rcx, qword [rdi+3*8]
        mov qword [rdi+8*8], rcx
        mov rcx, qword [rdi+3*8]
        mov qword [rdi+9*8], rcx
label_79:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], rsi
        mov rsp, rbp
        pop rbp
        ret 
label_80:
        mov qword [rdi+7*8], rsi
        mov qword [rdi+8*8], rsi
        mov qword [rdi+9*8], rsi
        jmp label_79

Node_addtag_ro:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rdx, rdi
        mov rcx, qword [rdx+10*8]
        lea rcx, [rcx+0*8+8]
        mov rdi, qword [rcx]
        mov rcx, qword [rdx+10*8]
        lea rcx, [rcx+0*8+8]
        mov rsi, qword [rdx+10*8]
        lea rsi, [rsi+1*8+8]
        mov rsi, qword [rsi]
        mov qword [rcx], rsi
        mov rcx, qword [rdx+10*8]
        lea rcx, [rcx+1*8+8]
        mov qword [rcx], rdi
        mov rcx, qword [rdx+7*8]
        mov rsi, qword [rdx+8*8]
        mov qword [rdx+7*8], rsi
        mov qword [rdx+8*8], rcx
        mov rcx, qword [rdx+6*8]
        xor rcx, 1
        mov qword [rdx+6*8], rcx
        mov rsp, rbp
        pop rbp
        ret 

Node_push_down:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsi, rdi
        mov rcx, qword [rsi+4*8]
        cmp rcx, 1
        je label_85
label_86:
        mov rcx, qword [rsi+6*8]
        cmp rcx, 1
        je label_97
label_98:
        mov rsp, rbp
        pop rbp
        ret 
label_97:
        mov r8, 0
label_99:
        cmp r8, 2
        jl label_101
        mov qword [rsi+6*8], 0
        jmp label_98
label_101:
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+r8*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_104
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+r8*8+8]
        mov r9, qword [rcx]
        mov rcx, qword [r9+10*8]
        lea rcx, [rcx+0*8+8]
        mov rdx, qword [rcx]
        mov rcx, qword [r9+10*8]
        lea rcx, [rcx+0*8+8]
        mov rdi, qword [r9+10*8]
        lea rdi, [rdi+1*8+8]
        mov rdi, qword [rdi]
        mov qword [rcx], rdi
        mov rcx, qword [r9+10*8]
        lea rcx, [rcx+1*8+8]
        mov qword [rcx], rdx
        mov rcx, qword [r9+7*8]
        mov rdx, qword [r9+8*8]
        mov qword [r9+7*8], rdx
        mov qword [r9+8*8], rcx
        mov rcx, qword [r9+6*8]
        xor rcx, 1
        mov qword [r9+6*8], rcx
label_104:
        inc r8
        jmp label_99
label_85:
        mov r8, 0
label_87:
        cmp r8, 2
        jl label_89
        mov qword [rsi+4*8], 0
        jmp label_86
label_89:
        mov rcx, qword [rsi+10*8]
        lea rcx, [rcx+r8*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_92
        mov rax, qword [rsi+10*8]
        lea rax, [rax+r8*8+8]
        mov r9, qword [rax]
        mov rdi, qword [rsi+5*8]
        mov qword [r9+1*8], rdi
        mov rax, qword [r9+2*8]
        imul rdi
        mov rcx, rax
        mov qword [r9+3*8], rcx
        cmp rdi, 0
        jl label_96
        mov rcx, qword [r9+3*8]
        mov qword [r9+7*8], rcx
        mov rcx, qword [r9+3*8]
        mov qword [r9+8*8], rcx
        mov rcx, qword [r9+3*8]
        mov qword [r9+9*8], rcx
label_95:
        mov qword [r9+4*8], 1
        mov qword [r9+5*8], rdi
label_92:
        inc r8
        jmp label_87
label_96:
        mov qword [r9+7*8], rdi
        mov qword [r9+8*8], rdi
        mov qword [r9+9*8], rdi
        jmp label_95

Node_rot:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rcx, rdi
        mov rdx, qword [rcx+11*8]
        mov rax, rdx
        mov rsi, rcx
        mov rax, qword [rax+10*8]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        mov rdi, rsi
        cmp rax, 0
        je label_113
        cmp rdi, 0
        je label_121
        lea rax, [rax+0*8]
        lea rsi, [rdi+0*8]
        mov rax, qword [rax]
        cmp rax, qword [rsi]
        je label_125
        mov rax, 0
label_112:
        cmp rax, 1
        je label_109
        mov rax, 1
label_108:
        mov rdi, rax
        lea rax, [rdx+10*8]
        mov rax, qword [rax]
        lea rsi, [rax+rdi*8+8]
        mov rax, rdi
        xor rax, 1
        mov r8, qword [rcx+10*8]
        lea rax, [r8+rax*8+8]
        mov rax, qword [rax]
        mov qword [rsi], rax
        mov rax, rdi
        xor rax, 1
        mov rsi, qword [rcx+10*8]
        lea rax, [rsi+rax*8+8]
        mov qword [rax], rdx
        lea rax, [rdx+10*8]
        mov rax, qword [rax]
        lea rax, [rax+rdi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_128
        lea rax, [rdx+10*8]
        mov rax, qword [rax]
        lea rax, [rax+rdi*8+8]
        mov rax, qword [rax]
        lea rax, [rax+11*8]
        mov qword [rax], rdx
label_128:
        lea rax, [rdx+11*8]
        mov rax, qword [rax]
        mov qword [rcx+11*8], rax
        lea rax, [rdx+11*8]
        mov qword [rax], rcx
        mov rax, qword [rcx+11*8]
        cmp rax, 0
        je label_130
        mov rax, qword [rcx+11*8]
        lea r8, [rax+10*8]
        mov rax, qword [rcx+11*8]
        mov rsi, rdx
        mov rax, qword [rax+10*8]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        mov rdi, rsi
        cmp rax, 0
        je label_136
        cmp rdi, 0
        je label_144
        lea rsi, [rax+0*8]
        lea rax, [rdi+0*8]
        mov rsi, qword [rsi]
        cmp rsi, qword [rax]
        je label_148
        mov rax, 0
label_135:
        cmp rax, 1
        je label_132
        mov rsi, 1
label_131:
        mov rax, qword [r8]
        lea rax, [rax+rsi*8+8]
        mov qword [rax], rcx
label_130:
        mov rdi, rdx
        call Node_push_up
        mov rsp, rbp
        pop rbp
        ret 
label_132:
        mov rsi, 0
        jmp label_131
label_148:
        mov rax, 1
        jmp label_135
label_144:
        mov rax, 0
        jmp label_135
label_136:
        cmp rdi, 0
        je label_138
        mov rax, 0
        jmp label_135
label_138:
        mov rax, 1
        jmp label_135
label_109:
        mov rax, 0
        jmp label_108
label_125:
        mov rax, 1
        jmp label_112
label_121:
        mov rax, 0
        jmp label_112
label_113:
        cmp rdi, 0
        je label_115
        mov rax, 0
        jmp label_112
label_115:
        mov rax, 1
        jmp label_112

Node_rotto:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push rbx
        push r15
        mov r15, rdi
        mov rbx, rsi
label_152:
        mov rcx, qword [r15+11*8]
        mov rax, rbx
        cmp rcx, 0
        je label_156
        cmp rax, 0
        je label_164
        lea rcx, [rcx+0*8]
        lea rax, [rax+0*8]
        mov rcx, qword [rcx]
        cmp rcx, qword [rax]
        je label_168
        mov rax, 0
label_155:
        cmp rax, 1
        je label_154
        mov rdx, qword [r15+11*8]
        lea rax, [rdx+11*8]
        mov rcx, qword [rax]
        mov rax, rbx
        cmp rcx, 0
        je label_173
        cmp rax, 0
        je label_181
        lea rcx, [rcx+0*8]
        lea rax, [rax+0*8]
        mov rcx, qword [rcx]
        cmp rcx, qword [rax]
        je label_185
        mov rax, 0
label_172:
        cmp rax, 1
        je label_170
        lea rax, [rdx+11*8]
        mov rax, qword [rax]
        mov rcx, rdx
        mov rax, qword [rax+10*8]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        mov rcx, rcx
        cmp rax, 0
        je label_195
        cmp rcx, 0
        je label_203
        lea rax, [rax+0*8]
        lea rcx, [rcx+0*8]
        mov rax, qword [rax]
        cmp rax, qword [rcx]
        je label_207
        mov rax, 0
label_194:
        cmp rax, 1
        je label_191
        mov rsi, 1
label_190:
        mov rax, rdx
        mov rcx, r15
        mov rax, qword [rax+10*8]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        mov rcx, rcx
        cmp rax, 0
        je label_214
        cmp rcx, 0
        je label_222
        lea rax, [rax+0*8]
        lea rcx, [rcx+0*8]
        mov rax, qword [rax]
        cmp rax, qword [rcx]
        je label_226
        mov rax, 0
label_213:
        cmp rax, 1
        je label_210
        mov rax, 1
label_209:
        cmp rsi, rax
        je label_187
        mov rdi, r15
        call Node_rot
        mov rdi, r15
        call Node_rot
label_188:
        jmp label_152
label_187:
        mov rdi, rdx
        call Node_rot
        mov rdi, r15
        call Node_rot
        jmp label_188
label_210:
        mov rax, 0
        jmp label_209
label_226:
        mov rax, 1
        jmp label_213
label_222:
        mov rax, 0
        jmp label_213
label_214:
        cmp rcx, 0
        je label_216
        mov rax, 0
        jmp label_213
label_216:
        mov rax, 1
        jmp label_213
label_191:
        mov rsi, 0
        jmp label_190
label_207:
        mov rax, 1
        jmp label_194
label_203:
        mov rax, 0
        jmp label_194
label_195:
        cmp rcx, 0
        je label_197
        mov rax, 0
        jmp label_194
label_197:
        mov rax, 1
        jmp label_194
label_170:
        mov rdi, r15
        call Node_rot
        jmp label_152
label_185:
        mov rax, 1
        jmp label_172
label_181:
        mov rax, 0
        jmp label_172
label_173:
        cmp rax, 0
        je label_175
        mov rax, 0
        jmp label_172
label_175:
        mov rax, 1
        jmp label_172
label_154:
        mov rdi, r15
        call Node_push_up
        mov rcx, qword [r15+11*8]
        cmp rcx, 0
        je label_229
        mov rdi, qword [r15+11*8]
        call Node_push_up
label_229:
        pop r15
        pop rbx
        mov rsp, rbp
        pop rbp
        ret 
label_168:
        mov rax, 1
        jmp label_155
label_164:
        mov rax, 0
        jmp label_155
label_156:
        cmp rax, 0
        je label_158
        mov rax, 0
        jmp label_155
label_158:
        mov rax, 1
        jmp label_155

Node_Node:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsp, rbp
        pop rbp
        ret 

splay_tree_build:
        push rbp
        mov rbp, rsp
        sub rsp, 16
        push r12
        push r13
        push rbx
        push r14
        push r15
        mov rbx, rdi
        mov r14, rsi
        mov r12, rdx
        mov rax, rcx
        mov qword [rbp+-8], rax
        mov r13, r8
        mov rax, qword [rbp+-8]
        mov rax, rax
        add rax, r13
        mov rax, rax
        mov rcx, 1
        sar rax, cl
        mov rax, rax
        mov qword [rbp+-16], rax
        mov rdi, 96
        call malloc
        mov rax, rax
        mov r15, rax
        mov rcx, qword [rel A_din_0]
        mov rax, qword [rbp+-16]
        lea rax, [rcx+rax*8+8]
        mov rcx, qword [rel V_id_cnt_0]
        inc rcx
        mov qword [rel V_id_cnt_0], rcx
        mov rdx, qword [rel V_id_cnt_0]
        mov rsi, qword [rax]
        mov rdi, r15
        call Node_init
        mov rsi, r15
        mov rdi, r14
        call Node_copy
        lea rax, [r14+11*8]
        mov qword [rax], r12
        mov rcx, qword [rbp+-8]
        mov rax, qword [rbp+-16]
        cmp rcx, rax
        jl label_233
label_234:
        mov rax, qword [rbp+-16]
        cmp r13, rax
        jg label_235
label_236:
        mov rdi, r14
        call Node_push_up
        pop r15
        pop r14
        pop rbx
        pop r13
        pop r12
        mov rsp, rbp
        pop rbp
        ret 
label_235:
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea r15, [rax+1*8+8]
        mov rdi, 96
        call malloc
        mov rax, rax
        mov qword [r15], rax
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov rcx, qword [rel V_id_cnt_0]
        inc rcx
        mov qword [rel V_id_cnt_0], rcx
        mov rdx, qword [rel V_id_cnt_0]
        mov rsi, 0
        mov rdi, qword [rax]
        call Node_init
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea rsi, [rax+1*8+8]
        mov rax, qword [rbp+-16]
        mov rax, rax
        inc rax
        mov r8, r13
        mov rcx, rax
        mov rdx, r14
        mov rsi, qword [rsi]
        mov rdi, rbx
        call splay_tree_build
        jmp label_236
label_233:
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea r15, [rax+0*8+8]
        mov rdi, 96
        call malloc
        mov rax, rax
        mov qword [r15], rax
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea rcx, [rax+0*8+8]
        mov rax, qword [rel V_id_cnt_0]
        inc rax
        mov qword [rel V_id_cnt_0], rax
        mov rdx, qword [rel V_id_cnt_0]
        mov rsi, 0
        mov rdi, qword [rcx]
        call Node_init
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea rsi, [rax+0*8+8]
        mov rax, qword [rbp+-16]
        mov rax, rax
        sub rax, 1
        mov r8, rax
        mov rax, qword [rbp+-8]
        mov rcx, rax
        mov rdx, r14
        mov rsi, qword [rsi]
        mov rdi, rbx
        call splay_tree_build
        jmp label_234

splay_tree_build_tree:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push rbx
        push r14
        push r15
        mov r14, rdi
        mov rbx, rsi
        mov r15, rdx
        mov rdi, 96
        call malloc
        mov rax, rax
        mov qword [r14+0*8], rax
        mov rax, qword [rel V_id_cnt_0]
        inc rax
        mov qword [rel V_id_cnt_0], rax
        mov rdx, qword [rel V_id_cnt_0]
        mov rsi, 0
        mov rdi, qword [r14+0*8]
        call Node_init
        mov r8, r15
        mov rcx, rbx
        mov rdx, 0
        mov rsi, qword [r14+0*8]
        mov rdi, r14
        call splay_tree_build
        pop r15
        pop r14
        pop rbx
        mov rsp, rbp
        pop rbp
        ret 

splay_tree_find:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rax, rdi
        mov rdi, rsi
        mov rsi, qword [rax+0*8]
        mov r8, 0
        lea rax, [rsi+10*8]
        mov rax, qword [rax]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_243
        lea rax, [rsi+10*8]
        mov rax, qword [rax]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        lea rax, [rax+2*8]
        mov rax, qword [rax]
        inc rax
        mov rax, rax
label_242:
label_244:
        mov rcx, r8
        add rcx, rax
        cmp rcx, rdi
        je label_246
        mov rcx, r8
        add rcx, rax
        cmp rdi, rcx
        jl label_247
        mov rcx, r8
        add rcx, rax
        mov r8, rcx
        lea rax, [rsi+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov rsi, qword [rax]
label_248:
        mov r9, rsi
        mov rax, qword [r9+4*8]
        cmp rax, 1
        je label_251
label_252:
        mov rax, qword [r9+6*8]
        cmp rax, 1
        je label_263
label_264:
        lea rax, [rsi+10*8]
        mov rax, qword [rax]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_274
        lea rax, [rsi+10*8]
        mov rax, qword [rax]
        lea rax, [rax+0*8+8]
        mov rax, qword [rax]
        lea rax, [rax+2*8]
        mov rax, qword [rax]
        inc rax
        mov rax, rax
label_273:
        jmp label_244
label_274:
        mov rax, 1
        jmp label_273
label_263:
        mov rcx, 0
label_265:
        cmp rcx, 2
        jl label_267
        mov qword [r9+6*8], 0
        jmp label_264
label_267:
        mov rax, qword [r9+10*8]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_270
        mov rax, qword [r9+10*8]
        lea rax, [rax+rcx*8+8]
        mov r11, qword [rax]
        mov rax, qword [r11+10*8]
        lea rax, [rax+0*8+8]
        mov r10, qword [rax]
        mov rax, qword [r11+10*8]
        lea rax, [rax+0*8+8]
        mov rdx, qword [r11+10*8]
        lea rdx, [rdx+1*8+8]
        mov rdx, qword [rdx]
        mov qword [rax], rdx
        mov rax, qword [r11+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], r10
        mov rax, qword [r11+7*8]
        mov rdx, qword [r11+8*8]
        mov qword [r11+7*8], rdx
        mov qword [r11+8*8], rax
        mov rax, qword [r11+6*8]
        xor rax, 1
        mov qword [r11+6*8], rax
label_270:
        inc rcx
        jmp label_265
label_251:
        mov rcx, 0
label_253:
        cmp rcx, 2
        jl label_255
        mov qword [r9+4*8], 0
        jmp label_252
label_255:
        mov rax, qword [r9+10*8]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_258
        mov rax, qword [r9+10*8]
        lea rax, [rax+rcx*8+8]
        mov r11, qword [rax]
        mov r10, qword [r9+5*8]
        mov qword [r11+1*8], r10
        mov rax, qword [r11+2*8]
        imul r10
        mov rax, rax
        mov qword [r11+3*8], rax
        cmp r10, 0
        jl label_262
        mov rax, qword [r11+3*8]
        mov qword [r11+7*8], rax
        mov rax, qword [r11+3*8]
        mov qword [r11+8*8], rax
        mov rax, qword [r11+3*8]
        mov qword [r11+9*8], rax
label_261:
        mov qword [r11+4*8], 1
        mov qword [r11+5*8], r10
label_258:
        inc rcx
        jmp label_253
label_262:
        mov qword [r11+7*8], r10
        mov qword [r11+8*8], r10
        mov qword [r11+9*8], r10
        jmp label_261
label_247:
        lea rax, [rsi+10*8]
        mov rax, qword [rax]
        lea rax, [rax+0*8+8]
        mov rsi, qword [rax]
        jmp label_248
label_246:
        mov rax, rsi
        mov rsp, rbp
        pop rbp
        ret 
label_243:
        mov rax, 1
        jmp label_242

splay_tree_dfs:
        push rbp
        mov rbp, rsp
        sub rsp, 64
        push r12
        push r13
        push r14
        push rbx
        push r15
        mov rcx, rdi
        mov qword [rbp+-24], rcx
        mov rcx, rsi
        mov qword [rbp+-32], rcx
        mov r15, 0
label_277:
        cmp r15, 2
        jl label_279
        pop r15
        pop rbx
        pop r14
        pop r13
        pop r12
        mov rsp, rbp
        pop rbp
        ret 
label_279:
        mov rcx, qword [rbp+-32]
        lea rcx, [rcx+10*8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+r15*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_282
        mov rcx, qword [rbp+-32]
        lea rcx, [rcx+10*8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+r15*8+8]
        mov rdx, qword [rbp+-24]
        mov rbx, rdx
        mov rcx, qword [rcx]
        mov qword [rbp+-40], rcx
        mov rcx, 0
        mov qword [rbp+-48], rcx
label_284:
        mov rcx, qword [rbp+-48]
        cmp rcx, 2
        jl label_286
label_282:
        inc r15
        jmp label_277
label_286:
        mov rcx, qword [rbp+-40]
        lea rcx, [rcx+10*8]
        mov rdx, qword [rcx]
        mov rcx, qword [rbp+-48]
        lea rcx, [rdx+rcx*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_289
        mov rcx, qword [rbp+-40]
        lea rcx, [rcx+10*8]
        mov rdx, qword [rcx]
        mov rcx, qword [rbp+-48]
        lea rcx, [rdx+rcx*8+8]
        mov r13, rbx
        mov rcx, qword [rcx]
        mov qword [rbp+-16], rcx
        mov r14, 0
label_291:
        cmp r14, 2
        jl label_293
label_289:
        mov rcx, qword [rbp+-48]
        inc rcx
        mov qword [rbp+-48], rcx
        jmp label_284
label_293:
        mov rcx, qword [rbp+-16]
        lea rcx, [rcx+10*8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+r14*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_296
        mov rcx, qword [rbp+-16]
        lea rcx, [rcx+10*8]
        mov rcx, qword [rcx]
        lea rcx, [rcx+r14*8+8]
        mov r12, r13
        mov rcx, qword [rcx]
        mov qword [rbp+-8], rcx
        mov rcx, 0
        mov qword [rbp+-56], rcx
label_298:
        mov rcx, qword [rbp+-56]
        cmp rcx, 2
        jl label_300
label_296:
        inc r14
        jmp label_291
label_300:
        mov rcx, qword [rbp+-8]
        lea rcx, [rcx+10*8]
        mov rdx, qword [rcx]
        mov rcx, qword [rbp+-56]
        lea rcx, [rdx+rcx*8+8]
        mov rcx, qword [rcx]
        cmp rcx, 0
        je label_303
        mov rax, qword [rbp+-8]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        mov rcx, qword [rbp+-56]
        lea rax, [rax+rcx*8+8]
        mov rsi, qword [rax]
        mov rdi, r12
        call splay_tree_dfs
label_303:
        mov rcx, qword [rbp+-56]
        inc rcx
        mov qword [rbp+-56], rcx
        jmp label_298

splay_tree_del:
        push rbp
        mov rbp, rsp
        sub rsp, 48
        push r12
        push r13
        push rbx
        push r14
        push r15
        mov r15, rdi
        mov rbx, rsi
        mov rax, rdx
        mov rax, rax
        inc rax
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov rax, rax
        mov qword [rbp+-40], rax
        mov rsi, 0
        mov rax, qword [rbp+-40]
        mov rdi, rax
        call Node_rotto
        mov rax, qword [rbp+-40]
        mov qword [r15+0*8], rax
        mov rax, rbx
        sub rax, 1
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov rax, rax
        mov qword [rbp+-40], rax
        mov rsi, qword [r15+0*8]
        mov rax, qword [rbp+-40]
        mov rdi, rax
        call Node_rotto
        mov rax, qword [rbp+-40]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_307
        mov rax, qword [rbp+-40]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov rbx, r15
        mov r14, qword [rax]
        mov rax, 0
        mov qword [rbp+-8], rax
label_309:
        mov rax, qword [rbp+-8]
        cmp rax, 2
        jl label_311
label_307:
        mov rax, qword [rbp+-40]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov qword [rax], 0
        mov rsi, 0
        mov rax, qword [rbp+-40]
        mov rdi, rax
        call Node_rotto
        mov rcx, qword [rbp+-40]
        mov qword [r15+0*8], rcx
        pop r15
        pop r14
        pop rbx
        pop r13
        pop r12
        mov rsp, rbp
        pop rbp
        ret 
label_311:
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        mov rcx, qword [rbp+-8]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_314
        lea rax, [r14+10*8]
        mov rcx, qword [rax]
        mov rax, qword [rbp+-8]
        lea rax, [rcx+rax*8+8]
        mov r13, rbx
        mov rax, qword [rax]
        mov qword [rbp+-32], rax
        mov rax, 0
        mov qword [rbp+-24], rax
label_316:
        mov rax, qword [rbp+-24]
        cmp rax, 2
        jl label_318
label_314:
        mov rax, qword [rbp+-8]
        inc rax
        mov qword [rbp+-8], rax
        jmp label_309
label_318:
        mov rax, qword [rbp+-32]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        mov rcx, qword [rbp+-24]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_321
        mov rax, qword [rbp+-32]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        mov rcx, qword [rbp+-24]
        lea rax, [rax+rcx*8+8]
        mov r12, r13
        mov rax, qword [rax]
        mov qword [rbp+-48], rax
        mov rax, 0
        mov qword [rbp+-16], rax
label_323:
        mov rax, qword [rbp+-16]
        cmp rax, 2
        jl label_325
label_321:
        mov rax, qword [rbp+-24]
        inc rax
        mov qword [rbp+-24], rax
        jmp label_316
label_325:
        mov rax, qword [rbp+-48]
        lea rax, [rax+10*8]
        mov rax, qword [rax]
        mov rcx, qword [rbp+-16]
        lea rax, [rax+rcx*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_328
        mov rax, qword [rbp+-48]
        lea rax, [rax+10*8]
        mov rcx, qword [rax]
        mov rax, qword [rbp+-16]
        lea rax, [rcx+rax*8+8]
        mov rsi, qword [rax]
        mov rdi, r12
        call splay_tree_dfs
label_328:
        mov rax, qword [rbp+-16]
        inc rax
        mov qword [rbp+-16], rax
        jmp label_323

splay_tree_change:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push r13
        push r14
        push rbx
        push r15
        mov r15, rdi
        mov r13, rsi
        mov rax, rdx
        mov r14, rcx
        mov rax, rax
        inc rax
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov rbx, rax
        mov rsi, 0
        mov rdi, rbx
        call Node_rotto
        mov qword [r15+0*8], rbx
        mov rax, r13
        sub rax, 1
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov rbx, rax
        mov rsi, qword [r15+0*8]
        mov rdi, rbx
        call Node_rotto
        lea rax, [rbx+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov rbx, qword [rax]
        mov rcx, rbx
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_332
label_333:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_344
label_345:
        mov rcx, rbx
        mov rsi, r14
        mov qword [rcx+1*8], rsi
        mov rax, qword [rcx+2*8]
        imul rsi
        mov rax, rax
        mov qword [rcx+3*8], rax
        cmp rsi, 0
        jl label_356
        mov rax, qword [rcx+3*8]
        mov qword [rcx+7*8], rax
        mov rax, qword [rcx+3*8]
        mov qword [rcx+8*8], rax
        mov rax, qword [rcx+3*8]
        mov qword [rcx+9*8], rax
label_355:
        mov qword [rcx+4*8], 1
        mov qword [rcx+5*8], rsi
        mov rcx, rbx
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_358
label_359:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_370
label_371:
        mov rsi, 0
        mov rdi, rbx
        call Node_rotto
        mov qword [r15+0*8], rbx
        pop r15
        pop rbx
        pop r14
        pop r13
        mov rsp, rbp
        pop rbp
        ret 
label_370:
        mov rsi, 0
label_372:
        cmp rsi, 2
        jl label_374
        mov qword [rcx+6*8], 0
        jmp label_371
label_374:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_377
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov r8, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rdx, [rax+0*8+8]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [rdx], rax
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], r8
        mov rdx, qword [rdi+7*8]
        mov rax, qword [rdi+8*8]
        mov qword [rdi+7*8], rax
        mov qword [rdi+8*8], rdx
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_377:
        inc rsi
        jmp label_372
label_358:
        mov rsi, 0
label_360:
        cmp rsi, 2
        jl label_362
        mov qword [rcx+4*8], 0
        jmp label_359
label_362:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_365
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_369
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_368:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_365:
        inc rsi
        jmp label_360
label_369:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_368
label_356:
        mov qword [rcx+7*8], rsi
        mov qword [rcx+8*8], rsi
        mov qword [rcx+9*8], rsi
        jmp label_355
label_344:
        mov rsi, 0
label_346:
        cmp rsi, 2
        jl label_348
        mov qword [rcx+6*8], 0
        jmp label_345
label_348:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_351
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov r8, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rdx, [rax+0*8+8]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [rdx], rax
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], r8
        mov rdx, qword [rdi+7*8]
        mov rax, qword [rdi+8*8]
        mov qword [rdi+7*8], rax
        mov qword [rdi+8*8], rdx
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_351:
        inc rsi
        jmp label_346
label_332:
        mov rsi, 0
label_334:
        cmp rsi, 2
        jl label_336
        mov qword [rcx+4*8], 0
        jmp label_333
label_336:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_339
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_343
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_342:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_339:
        inc rsi
        jmp label_334
label_343:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_342

splay_tree_rol:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push r14
        push rbx
        push r15
        mov r15, rdi
        mov r14, rsi
        mov rax, rdx
        mov rax, rax
        inc rax
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov rbx, rax
        mov rsi, 0
        mov rdi, rbx
        call Node_rotto
        mov qword [r15+0*8], rbx
        mov rax, r14
        sub rax, 1
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov rbx, rax
        mov rsi, qword [r15+0*8]
        mov rdi, rbx
        call Node_rotto
        lea rax, [rbx+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov rbx, qword [rax]
        mov rcx, rbx
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_382
label_383:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_394
label_395:
        mov rcx, rbx
        mov rax, qword [rcx+10*8]
        lea rax, [rax+0*8+8]
        mov rsi, qword [rax]
        mov rax, qword [rcx+10*8]
        lea rdx, [rax+0*8+8]
        mov rax, qword [rcx+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [rdx], rax
        mov rax, qword [rcx+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], rsi
        mov rax, qword [rcx+7*8]
        mov rdx, qword [rcx+8*8]
        mov qword [rcx+7*8], rdx
        mov qword [rcx+8*8], rax
        mov rax, qword [rcx+6*8]
        xor rax, 1
        mov qword [rcx+6*8], rax
        mov rcx, rbx
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_405
label_406:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_417
label_418:
        mov rsi, 0
        mov rdi, rbx
        call Node_rotto
        mov qword [r15+0*8], rbx
        pop r15
        pop rbx
        pop r14
        mov rsp, rbp
        pop rbp
        ret 
label_417:
        mov rsi, 0
label_419:
        cmp rsi, 2
        jl label_421
        mov qword [rcx+6*8], 0
        jmp label_418
label_421:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_424
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov r8, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov rdx, qword [rdi+10*8]
        lea rdx, [rdx+1*8+8]
        mov rdx, qword [rdx]
        mov qword [rax], rdx
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], r8
        mov rdx, qword [rdi+7*8]
        mov rax, qword [rdi+8*8]
        mov qword [rdi+7*8], rax
        mov qword [rdi+8*8], rdx
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_424:
        inc rsi
        jmp label_419
label_405:
        mov rsi, 0
label_407:
        cmp rsi, 2
        jl label_409
        mov qword [rcx+4*8], 0
        jmp label_406
label_409:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_412
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_416
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_415:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_412:
        inc rsi
        jmp label_407
label_416:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_415
label_394:
        mov rsi, 0
label_396:
        cmp rsi, 2
        jl label_398
        mov qword [rcx+6*8], 0
        jmp label_395
label_398:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_401
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov r8, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rdx, [rax+0*8+8]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [rdx], rax
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], r8
        mov rdx, qword [rdi+7*8]
        mov rax, qword [rdi+8*8]
        mov qword [rdi+7*8], rax
        mov qword [rdi+8*8], rdx
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_401:
        inc rsi
        jmp label_396
label_382:
        mov rsi, 0
label_384:
        cmp rsi, 2
        jl label_386
        mov qword [rcx+4*8], 0
        jmp label_383
label_386:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_389
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_393
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_392:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_389:
        inc rsi
        jmp label_384
label_393:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_392

splay_tree_getsum:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push rbx
        push r14
        push r15
        mov rbx, rdi
        mov r15, rsi
        mov rax, rdx
        mov rax, rax
        inc rax
        mov rsi, rax
        mov rdi, rbx
        call splay_tree_find
        mov rax, rax
        mov r14, rax
        mov rsi, 0
        mov rdi, r14
        call Node_rotto
        mov qword [rbx+0*8], r14
        mov rax, r15
        sub rax, 1
        mov rsi, rax
        mov rdi, rbx
        call splay_tree_find
        mov rax, rax
        mov r14, rax
        mov rsi, qword [rbx+0*8]
        mov rdi, r14
        call Node_rotto
        lea rax, [r14+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov r14, qword [rax]
        mov rcx, r14
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_429
label_430:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_441
label_442:
        lea rax, [r14+3*8]
        mov r15, qword [rax]
        mov rsi, 0
        mov rdi, r14
        call Node_rotto
        mov qword [rbx+0*8], r14
        mov rax, r15
        pop r15
        pop r14
        pop rbx
        mov rsp, rbp
        pop rbp
        ret 
label_441:
        mov rsi, 0
label_443:
        cmp rsi, 2
        jl label_445
        mov qword [rcx+6*8], 0
        jmp label_442
label_445:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_448
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov r8, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rdx, [rax+0*8+8]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [rdx], rax
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], r8
        mov rax, qword [rdi+7*8]
        mov rdx, qword [rdi+8*8]
        mov qword [rdi+7*8], rdx
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_448:
        inc rsi
        jmp label_443
label_429:
        mov rsi, 0
label_431:
        cmp rsi, 2
        jl label_433
        mov qword [rcx+4*8], 0
        jmp label_430
label_433:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_436
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_440
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_439:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_436:
        inc rsi
        jmp label_431
label_440:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_439

splay_tree_getMax:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rsi, rdi
        mov rdi, qword [rsi+0*8]
        mov rax, qword [rdi+4*8]
        cmp rax, 1
        je label_453
label_454:
        mov rax, qword [rdi+6*8]
        cmp rax, 1
        je label_465
label_466:
        mov rax, qword [rsi+0*8]
        lea rax, [rax+9*8]
        mov rax, qword [rax]
        mov rsp, rbp
        pop rbp
        ret 
label_465:
        mov r8, 0
label_467:
        cmp r8, 2
        jl label_469
        mov qword [rdi+6*8], 0
        jmp label_466
label_469:
        mov rax, qword [rdi+10*8]
        lea rax, [rax+r8*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_472
        mov rax, qword [rdi+10*8]
        lea rax, [rax+r8*8+8]
        mov r9, qword [rax]
        mov rax, qword [r9+10*8]
        lea rax, [rax+0*8+8]
        mov rdx, qword [rax]
        mov rax, qword [r9+10*8]
        lea rcx, [rax+0*8+8]
        mov rax, qword [r9+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [rcx], rax
        mov rax, qword [r9+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], rdx
        mov rcx, qword [r9+7*8]
        mov rax, qword [r9+8*8]
        mov qword [r9+7*8], rax
        mov qword [r9+8*8], rcx
        mov rax, qword [r9+6*8]
        xor rax, 1
        mov qword [r9+6*8], rax
label_472:
        inc r8
        jmp label_467
label_453:
        mov r8, 0
label_455:
        cmp r8, 2
        jl label_457
        mov qword [rdi+4*8], 0
        jmp label_454
label_457:
        mov rax, qword [rdi+10*8]
        lea rax, [rax+r8*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_460
        mov rax, qword [rdi+10*8]
        lea rax, [rax+r8*8+8]
        mov r9, qword [rax]
        mov rcx, qword [rdi+5*8]
        mov qword [r9+1*8], rcx
        mov rax, qword [r9+2*8]
        imul rcx
        mov rax, rax
        mov qword [r9+3*8], rax
        cmp rcx, 0
        jl label_464
        mov rax, qword [r9+3*8]
        mov qword [r9+7*8], rax
        mov rax, qword [r9+3*8]
        mov qword [r9+8*8], rax
        mov rax, qword [r9+3*8]
        mov qword [r9+9*8], rax
label_463:
        mov qword [r9+4*8], 1
        mov qword [r9+5*8], rcx
label_460:
        inc r8
        jmp label_455
label_464:
        mov qword [r9+7*8], rcx
        mov qword [r9+8*8], rcx
        mov qword [r9+9*8], rcx
        jmp label_463

splay_tree_splay_tree:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rcx, rdi
        mov qword [rcx+0*8], 0
        mov rsp, rbp
        pop rbp
        ret 

equ:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        mov rax, rdi
        mov rcx, rsi
        cmp rax, 0
        je label_478
        cmp rcx, 0
        je label_486
        lea rax, [rax+0*8]
        lea rcx, [rcx+0*8]
        mov rax, qword [rax]
        cmp rax, qword [rcx]
        je label_490
        mov rax, 0
label_477:
        mov rsp, rbp
        pop rbp
        ret 
label_490:
        mov rax, 1
        jmp label_477
label_486:
        mov rax, 0
        jmp label_477
label_478:
        cmp rcx, 0
        je label_480
        mov rax, 0
        jmp label_477
label_480:
        mov rax, 1
        jmp label_477

merge:
        push rbp
        mov rbp, rsp
        sub rsp, 0
        push r13
        push r14
        push rbx
        push r15
        mov rbx, rdi
        mov r15, rsi
        mov r14, rdx
        mov rax, rbx
        inc rax
        mov rsi, rax
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov r13, rax
        mov rsi, 0
        mov rdi, r13
        call Node_rotto
        lea rax, [r15+0*8]
        mov qword [rax], r13
        mov rsi, rbx
        mov rdi, r15
        call splay_tree_find
        mov rax, rax
        mov r13, rax
        lea rax, [r15+0*8]
        mov rsi, qword [rax]
        mov rdi, r13
        call Node_rotto
        lea rax, [r13+10*8]
        mov rax, qword [rax]
        lea rcx, [rax+1*8+8]
        lea rax, [r14+0*8]
        mov rax, qword [rax]
        mov qword [rcx], rax
        lea rax, [r14+0*8]
        mov rax, qword [rax]
        lea rax, [rax+11*8]
        mov qword [rax], r13
        mov rsi, 0
        mov rdi, r13
        call Node_rotto
        lea rcx, [r15+0*8]
        mov qword [rcx], r13
        pop r15
        pop rbx
        pop r14
        pop r13
        mov rsp, rbp
        pop rbp
        ret 

main:
        push rbp
        mov rbp, rsp
        sub rsp, 16
        push r12
        push r13
        push r14
        push rbx
        push r15
        call ___init
        call getInt
        mov rax, rax
        mov qword [rel V_n_0], rax
        call getInt
        mov rax, rax
        mov qword [rel V_m_0], rax
        mov rdi, 8
        call malloc
        mov rax, rax
        mov r13, rax
        mov qword [r13+0*8], 0
        mov qword [rel A_sp_0], rax
        mov rdi, 8
        call malloc
        mov rax, rax
        mov r13, rax
        mov qword [r13+0*8], 0
        mov qword [rel A_dintree_0], rax
        mov rax, qword [rel A_din_0]
        lea rcx, [rax+0*8+8]
        mov rax, qword [rel V_INF_0]
        neg rax
        mov qword [rcx], rax
        mov rcx, qword [rel V_n_0]
        inc rcx
        mov rax, qword [rel A_din_0]
        lea rax, [rax+rcx*8+8]
        mov rcx, qword [rel V_INF_0]
        neg rcx
        mov qword [rax], rcx
        mov rbx, 1
label_498:
        cmp rbx, qword [rel V_n_0]
        jg label_499
        mov rax, qword [rel A_din_0]
        lea r15, [rax+rbx*8+8]
        call getInt
        mov rax, rax
        mov qword [r15], rax
        inc rbx
        jmp label_498
label_499:
        mov rax, qword [rel V_n_0]
        inc rax
        mov r13, qword [rel A_sp_0]
        mov r12, 0
        mov r15, rax
        mov rdi, 96
        call malloc
        mov rax, rax
        mov qword [r13+0*8], rax
        mov rax, qword [rel V_id_cnt_0]
        inc rax
        mov qword [rel V_id_cnt_0], rax
        mov rdx, qword [rel V_id_cnt_0]
        mov rsi, 0
        mov rdi, qword [r13+0*8]
        call Node_init
        mov r8, r15
        mov rcx, r12
        mov rdx, 0
        mov rsi, qword [r13+0*8]
        mov rdi, r13
        call splay_tree_build
        mov rbx, 1
label_503:
        cmp rbx, qword [rel V_m_0]
        jg label_504
        call getString
        mov rax, rax
        mov r14, rax
        mov rsi, 0
        mov rdi, r14
        call string_ord
        mov r15, rax
        mov rsi, 0
        mov rdi, qword [rel A_char_ID_0]
        call string_ord
        mov rax, rax
        cmp r15, rax
        je label_507
label_508:
        mov rsi, 0
        mov rdi, r14
        call string_ord
        mov r15, rax
        mov rsi, 1
        mov rdi, qword [rel A_char_ID_0]
        call string_ord
        mov rax, rax
        cmp r15, rax
        je label_514
label_515:
        mov rsi, 0
        mov rdi, r14
        call string_ord
        mov rax, rax
        cmp rax, 82
        je label_516
label_517:
        mov rsi, 0
        mov rdi, r14
        call string_ord
        mov rax, rax
        cmp rax, 71
        je label_518
label_519:
        mov rsi, 0
        mov rdi, r14
        call string_ord
        mov rax, rax
        cmp rax, 77
        je label_546
label_547:
        inc rbx
        jmp label_503
label_546:
        mov rsi, 2
        mov rdi, r14
        call string_ord
        mov rax, rax
        cmp rax, 75
        je label_548
        mov r13, qword [rel A_sp_0]
        mov rcx, qword [r13+0*8]
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_553
label_554:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_565
label_566:
        mov rax, qword [r13+0*8]
        lea rax, [rax+9*8]
        mov rax, qword [rax]
        mov rdi, rax
        call toString
        mov rax, rax
        mov rsi, S_2
        mov rdi, rax
        call string_strcat
        mov rax, rax
        mov rdi, rax
        call print
label_549:
        jmp label_547
label_565:
        mov rsi, 0
label_567:
        cmp rsi, 2
        jl label_569
        mov qword [rcx+6*8], 0
        jmp label_566
label_569:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_572
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov rdx, qword [rax]
        mov rax, qword [rdi+10*8]
        lea r8, [rax+0*8+8]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov rax, qword [rax]
        mov qword [r8], rax
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], rdx
        mov rdx, qword [rdi+7*8]
        mov rax, qword [rdi+8*8]
        mov qword [rdi+7*8], rax
        mov qword [rdi+8*8], rdx
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_572:
        inc rsi
        jmp label_567
label_553:
        mov rsi, 0
label_555:
        cmp rsi, 2
        jl label_557
        mov qword [rcx+4*8], 0
        jmp label_554
label_557:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_560
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_564
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_563:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_560:
        inc rsi
        jmp label_555
label_564:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_563
label_548:
        call getInt
        mov rax, rax
        mov r15, rax
        call getInt
        mov rax, rax
        mov r14, rax
        call getInt
        mov rax, rax
        mov rcx, rax
        mov rax, r15
        inc rax
        mov rdx, r15
        add rdx, r14
        mov rcx, rcx
        mov rdx, rdx
        mov rsi, rax
        mov rdi, qword [rel A_sp_0]
        call splay_tree_change
        jmp label_549
label_518:
        call getInt
        mov rax, rax
        mov r15, rax
        call getInt
        mov rax, rax
        mov rax, rax
        cmp rax, 0
        jg label_520
        mov rdi, S_1
        call print
label_521:
        jmp label_519
label_520:
        mov rcx, r15
        inc rcx
        mov rdx, r15
        add rdx, rax
        mov r13, qword [rel A_sp_0]
        mov r12, rcx
        mov rax, rdx
        mov rax, rax
        inc rax
        mov rsi, rax
        mov rdi, r13
        call splay_tree_find
        mov rax, rax
        mov r15, rax
        mov rsi, 0
        mov rdi, r15
        call Node_rotto
        mov qword [r13+0*8], r15
        mov rax, r12
        sub rax, 1
        mov rsi, rax
        mov rdi, r13
        call splay_tree_find
        mov rax, rax
        mov r15, rax
        mov rsi, qword [r13+0*8]
        mov rdi, r15
        call Node_rotto
        lea rax, [r15+10*8]
        mov rax, qword [rax]
        lea rax, [rax+1*8+8]
        mov r15, qword [rax]
        mov rcx, r15
        mov rax, qword [rcx+4*8]
        cmp rax, 1
        je label_525
label_526:
        mov rax, qword [rcx+6*8]
        cmp rax, 1
        je label_537
label_538:
        lea rax, [r15+3*8]
        mov r12, qword [rax]
        mov rsi, 0
        mov rdi, r15
        call Node_rotto
        mov qword [r13+0*8], r15
        mov rax, r12
        mov rdi, rax
        call toString
        mov rax, rax
        mov rdi, rax
        call println
        jmp label_521
label_537:
        mov rsi, 0
label_539:
        cmp rsi, 2
        jl label_541
        mov qword [rcx+6*8], 0
        jmp label_538
label_541:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_544
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov rdx, qword [rax]
        mov rax, qword [rdi+10*8]
        lea rax, [rax+0*8+8]
        mov r8, qword [rdi+10*8]
        lea r8, [r8+1*8+8]
        mov r8, qword [r8]
        mov qword [rax], r8
        mov rax, qword [rdi+10*8]
        lea rax, [rax+1*8+8]
        mov qword [rax], rdx
        mov rdx, qword [rdi+7*8]
        mov rax, qword [rdi+8*8]
        mov qword [rdi+7*8], rax
        mov qword [rdi+8*8], rdx
        mov rax, qword [rdi+6*8]
        xor rax, 1
        mov qword [rdi+6*8], rax
label_544:
        inc rsi
        jmp label_539
label_525:
        mov rsi, 0
label_527:
        cmp rsi, 2
        jl label_529
        mov qword [rcx+4*8], 0
        jmp label_526
label_529:
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rax, qword [rax]
        cmp rax, 0
        je label_532
        mov rax, qword [rcx+10*8]
        lea rax, [rax+rsi*8+8]
        mov rdi, qword [rax]
        mov r8, qword [rcx+5*8]
        mov qword [rdi+1*8], r8
        mov rax, qword [rdi+2*8]
        imul r8
        mov rax, rax
        mov qword [rdi+3*8], rax
        cmp r8, 0
        jl label_536
        mov rax, qword [rdi+3*8]
        mov qword [rdi+7*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+8*8], rax
        mov rax, qword [rdi+3*8]
        mov qword [rdi+9*8], rax
label_535:
        mov qword [rdi+4*8], 1
        mov qword [rdi+5*8], r8
label_532:
        inc rsi
        jmp label_527
label_536:
        mov qword [rdi+7*8], r8
        mov qword [rdi+8*8], r8
        mov qword [rdi+9*8], r8
        jmp label_535
label_516:
        call getInt
        mov rax, rax
        mov r15, rax
        call getInt
        mov rax, rax
        mov rax, rax
        mov rcx, r15
        inc rcx
        mov rdx, r15
        add rdx, rax
        mov rdx, rdx
        mov rsi, rcx
        mov rdi, qword [rel A_sp_0]
        call splay_tree_rol
        jmp label_517
label_514:
        call getInt
        mov rax, rax
        mov r15, rax
        call getInt
        mov rax, rax
        mov rdx, rax
        mov rax, r15
        inc rax
        mov rcx, r15
        add rcx, rdx
        mov rdx, rcx
        mov rsi, rax
        mov rdi, qword [rel A_sp_0]
        call splay_tree_del
        jmp label_515
label_507:
        call getInt
        mov rax, rax
        mov rax, rax
        mov qword [rbp+-8], rax
        call getInt
        mov rax, rax
        mov r15, rax
        mov r12, 1
label_509:
        cmp r12, r15
        jg label_510
        mov rax, qword [rel A_din_0]
        lea r13, [rax+r12*8+8]
        call getInt
        mov rax, rax
        mov qword [r13], rax
        inc r12
        jmp label_509
label_510:
        mov r13, qword [rel A_dintree_0]
        mov r12, 1
        mov r15, r15
        mov rdi, 96
        call malloc
        mov rax, rax
        mov qword [r13+0*8], rax
        mov rax, qword [rel V_id_cnt_0]
        inc rax
        mov qword [rel V_id_cnt_0], rax
        mov rdx, qword [rel V_id_cnt_0]
        mov rsi, 0
        mov rdi, qword [r13+0*8]
        call Node_init
        mov r8, r15
        mov rcx, r12
        mov rdx, 0
        mov rsi, qword [r13+0*8]
        mov rdi, r13
        call splay_tree_build
        mov rax, qword [rbp+-8]
        mov rax, rax
        inc rax
        mov rdx, qword [rel A_dintree_0]
        mov rsi, qword [rel A_sp_0]
        mov rdi, rax
        call merge
        jmp label_508
label_504:
        mov rax, 0
        pop r15
        pop rbx
        pop r14
        pop r13
        pop r12
        mov rsp, rbp
        pop rbp
        ret 



SECTION .data    align=8



SECTION .bss     align=8
V_INF_0:
         resq 1
V_nMax_0:
         resq 1
V_n_0:
         resq 1
V_m_0:
         resq 1
V_id_cnt_0:
         resq 1
A_din_0:
         resq 1
A_sp_0:
         resq 1
A_dintree_0:
         resq 1
A_char_ID_0:
         resq 1

SECTION .rodata
S_1: 
         dq 2
         db 30H, 0AH, 00H
S_0: 
         dq 2
         db 49H, 44H, 00H
S_2: 
         dq 1
         db 0AH, 00H

L_033:
        db 25H, 6CH, 64H, 00H

L_032:
        db 25H, 73H, 00H



