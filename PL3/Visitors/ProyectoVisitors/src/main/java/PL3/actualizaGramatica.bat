@echo off
antlr LinguineLexer.g4 -no-listener -visitor
antlr LinguineParser.g4 -no-listener -visitor
