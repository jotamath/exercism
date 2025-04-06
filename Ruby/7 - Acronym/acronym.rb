=begin
Write your code for the 'Acronym' exercise in this file. Make the tests in
`acronym_test.rb` pass.

To get started with TDD, see the `README.md` file in your
`ruby/acronym` directory.
=end
class Acronym
  # Método para gerar o acrônimo
  def self.abbreviate(phrase)
    # Remover caracteres desnecessários, mantendo apenas palavras e hífens
    cleaned_phrase = phrase.gsub(/[^a-zA-Z0-9\- ]/, '')

    # Dividir a frase em palavras
    words = cleaned_phrase.split(/[\s\-]+/)

    # Coletar a primeira letra de cada palavra, em maiúsculas
    acronym = words.map { |word| word[0].upcase }.join

    acronym
  end
end