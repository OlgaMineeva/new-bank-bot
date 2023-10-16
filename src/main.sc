require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /pin
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: pin
        intent!: /пароль
        a: Здравствуйте!
        
    state: Match
        event!: match
        a: {{$context.intent.answer}}