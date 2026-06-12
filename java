// Aguarda o documento HTML ser completamente carregado antes de executar as ações
document.addEventListener('DOMContentLoaded', () => {

    // 1. Funcionalidade: Revelar participantes do Concurso
    const btnParticipantes = document.getElementById('btn-participantes');
    const painelParticipantes = document.getElementById('revelar-participantes');

    if (btnParticipantes && painelParticipantes) {
        btnParticipantes.addEventListener('click', () => {
            // Verifica se a lista está escondida
            if (painelParticipantes.classList.contains('escondido')) {
                // Mostra a lista removendo a classe CSS
                painelParticipantes.classList.remove('escondido');
                btnParticipantes.textContent = 'Ocultar participantes';
            } else {
                // Esconde a lista adicionando a classe de volta
                painelParticipantes.classList.add('escondido');
                btnParticipantes.textContent = 'Quem pode participar?';
            }
        });
    }

    // 2. Funcionalidade: Envio simulado do formulário de e-mail
    const formContato = document.getElementById('form-contato');
    const msgSucesso = document.getElementById('mensagem-sucesso');

    if (formContato && msgSucesso) {
        formContato.addEventListener('submit', (evento) => {
            // Impede que a página recarregue ao enviar o formulário
            evento.preventDefault();
            
            // Pega o valor digitado pelo usuário
            const emailDigitado = document.getElementById('input-email').value;
            
            // Aqui você poderia enviar esse dado para um servidor real. 
            console.log(`E-mail cadastrado para novidades do Agrinho: ${emailDigitado}`);

            // Esconde o formulário e mostra a mensagem verde de sucesso
            formContato.classList.add('escondido');
            msgSucesso.classList.remove('escondido');
        });
    }

});
