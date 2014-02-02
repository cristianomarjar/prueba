// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Ejer.g 2013-09-23 22:07:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EjerLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int STRI=10;
    public static final int T__20=20;
    public static final int ENT=8;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int ModificadorDeAcceso=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int P=6;
    public static final int OPrelacional=7;
    public static final int T__30=30;
    public static final int FLOT=9;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=11;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

    // delegates
    // delegators

    public EjerLexer() {;} 
    public EjerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EjerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Ejer.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:3:7: ( 'clase' )
            // Ejer.g:3:9: 'clase'
            {
            match("clase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:4:7: ( '{' )
            // Ejer.g:4:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:5:7: ( '}' )
            // Ejer.g:5:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:6:7: ( '(' )
            // Ejer.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:7:7: ( ')' )
            // Ejer.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:8:7: ( ',' )
            // Ejer.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:9:7: ( 'cambio' )
            // Ejer.g:9:9: 'cambio'
            {
            match("cambio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:10:7: ( 'caso' )
            // Ejer.g:10:9: 'caso'
            {
            match("caso"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:11:7: ( ':' )
            // Ejer.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:12:7: ( '\"' )
            // Ejer.g:12:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:13:7: ( ';' )
            // Ejer.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:14:7: ( 'romper' )
            // Ejer.g:14:9: 'romper'
            {
            match("romper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:15:7: ( 'predeterminado' )
            // Ejer.g:15:9: 'predeterminado'
            {
            match("predeterminado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:16:7: ( 'si' )
            // Ejer.g:16:9: 'si'
            {
            match("si"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:17:7: ( 'entonces' )
            // Ejer.g:17:9: 'entonces'
            {
            match("entonces"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:18:7: ( 'contrario' )
            // Ejer.g:18:9: 'contrario'
            {
            match("contrario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:19:7: ( 'retorno' )
            // Ejer.g:19:9: 'retorno'
            {
            match("retorno"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:20:7: ( 'ciclo' )
            // Ejer.g:20:9: 'ciclo'
            {
            match("ciclo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:21:7: ( '++' )
            // Ejer.g:21:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:22:7: ( '--' )
            // Ejer.g:22:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:23:7: ( 'mientras' )
            // Ejer.g:23:9: 'mientras'
            {
            match("mientras"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:24:7: ( 'y' )
            // Ejer.g:24:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:25:7: ( 'o' )
            // Ejer.g:25:9: 'o'
            {
            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:26:7: ( 'intentar' )
            // Ejer.g:26:9: 'intentar'
            {
            match("intentar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:27:7: ( 'finally' )
            // Ejer.g:27:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:28:7: ( 'captura' )
            // Ejer.g:28:9: 'captura'
            {
            match("captura"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:29:7: ( 'e' )
            // Ejer.g:29:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:30:7: ( 'Exception' )
            // Ejer.g:30:9: 'Exception'
            {
            match("Exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:31:7: ( 'NullReferenceException' )
            // Ejer.g:31:9: 'NullReferenceException'
            {
            match("NullReferenceException"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:32:7: ( 'RuntimeException' )
            // Ejer.g:32:9: 'RuntimeException'
            {
            match("RuntimeException"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:33:7: ( '=' )
            // Ejer.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:34:7: ( '+' )
            // Ejer.g:34:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:35:7: ( '-' )
            // Ejer.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:36:7: ( '*' )
            // Ejer.g:36:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:37:7: ( 'entero' )
            // Ejer.g:37:9: 'entero'
            {
            match("entero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:38:7: ( 'flotante' )
            // Ejer.g:38:9: 'flotante'
            {
            match("flotante"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:39:7: ( 'cadena' )
            // Ejer.g:39:9: 'cadena'
            {
            match("cadena"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            int _type = P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:43:6: ( '.' )
            // Ejer.g:43:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "OPrelacional"
    public final void mOPrelacional() throws RecognitionException {
        try {
            int _type = OPrelacional;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:67:13: ( '==' | '<=' | '!=' | '>=' | '<' | '>' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt1=1;
                }
                break;
            case '<':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=2;
                }
                else {
                    alt1=5;}
                }
                break;
            case '!':
                {
                alt1=3;
                }
                break;
            case '>':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // Ejer.g:67:15: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // Ejer.g:67:22: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 3 :
                    // Ejer.g:67:29: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 4 :
                    // Ejer.g:67:36: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // Ejer.g:67:43: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 6 :
                    // Ejer.g:67:49: '>'
                    {
                    match('>'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPrelacional"

    // $ANTLR start "ModificadorDeAcceso"
    public final void mModificadorDeAcceso() throws RecognitionException {
        try {
            int _type = ModificadorDeAcceso;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:104:20: ( ( 'publica' | 'publico' ) | ( 'privada' | 'privado' ) | ( 'protegida' | 'protegido' ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='p') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='u') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='r') ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='i') ) {
                        alt5=2;
                    }
                    else if ( (LA5_3=='o') ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Ejer.g:104:22: ( 'publica' | 'publico' )
                    {
                    // Ejer.g:104:22: ( 'publica' | 'publico' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='p') ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1=='u') ) {
                            int LA2_2 = input.LA(3);

                            if ( (LA2_2=='b') ) {
                                int LA2_3 = input.LA(4);

                                if ( (LA2_3=='l') ) {
                                    int LA2_4 = input.LA(5);

                                    if ( (LA2_4=='i') ) {
                                        int LA2_5 = input.LA(6);

                                        if ( (LA2_5=='c') ) {
                                            int LA2_6 = input.LA(7);

                                            if ( (LA2_6=='a') ) {
                                                alt2=1;
                                            }
                                            else if ( (LA2_6=='o') ) {
                                                alt2=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 6, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // Ejer.g:104:23: 'publica'
                            {
                            match("publica"); 


                            }
                            break;
                        case 2 :
                            // Ejer.g:104:33: 'publico'
                            {
                            match("publico"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Ejer.g:104:44: ( 'privada' | 'privado' )
                    {
                    // Ejer.g:104:44: ( 'privada' | 'privado' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='p') ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1=='r') ) {
                            int LA3_2 = input.LA(3);

                            if ( (LA3_2=='i') ) {
                                int LA3_3 = input.LA(4);

                                if ( (LA3_3=='v') ) {
                                    int LA3_4 = input.LA(5);

                                    if ( (LA3_4=='a') ) {
                                        int LA3_5 = input.LA(6);

                                        if ( (LA3_5=='d') ) {
                                            int LA3_6 = input.LA(7);

                                            if ( (LA3_6=='a') ) {
                                                alt3=1;
                                            }
                                            else if ( (LA3_6=='o') ) {
                                                alt3=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 3, 6, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 3, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // Ejer.g:104:45: 'privada'
                            {
                            match("privada"); 


                            }
                            break;
                        case 2 :
                            // Ejer.g:104:55: 'privado'
                            {
                            match("privado"); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Ejer.g:104:66: ( 'protegida' | 'protegido' )
                    {
                    // Ejer.g:104:66: ( 'protegida' | 'protegido' )
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // Ejer.g:104:67: 'protegida'
                            {
                            match("protegida"); 


                            }
                            break;
                        case 2 :
                            // Ejer.g:104:79: 'protegido'
                            {
                            match("protegido"); 


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ModificadorDeAcceso"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:115:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Ejer.g:115:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Ejer.g:115:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Ejer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRI"
    public final void mSTRI() throws RecognitionException {
        try {
            int _type = STRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:116:5: ( ( 'a' .. 'z' )* )
            // Ejer.g:116:6: ( 'a' .. 'z' )*
            {
            // Ejer.g:116:6: ( 'a' .. 'z' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Ejer.g:116:7: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRI"

    // $ANTLR start "ENT"
    public final void mENT() throws RecognitionException {
        try {
            int _type = ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:117:4: ( ( '0' .. '9' )+ )
            // Ejer.g:117:6: ( '0' .. '9' )+
            {
            // Ejer.g:117:6: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Ejer.g:117:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENT"

    // $ANTLR start "FLOT"
    public final void mFLOT() throws RecognitionException {
        try {
            int _type = FLOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:118:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // Ejer.g:118:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // Ejer.g:118:7: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Ejer.g:118:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match('.'); 
            // Ejer.g:118:23: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Ejer.g:118:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ejer.g:123:5: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // Ejer.g:123:7: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // Ejer.g:123:7: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Ejer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Ejer.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | P | OPrelacional | ModificadorDeAcceso | ID | STRI | ENT | FLOT | WS )
        int alt12=45;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // Ejer.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // Ejer.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // Ejer.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // Ejer.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // Ejer.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // Ejer.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // Ejer.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // Ejer.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // Ejer.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // Ejer.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // Ejer.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // Ejer.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // Ejer.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // Ejer.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // Ejer.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // Ejer.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // Ejer.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // Ejer.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // Ejer.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // Ejer.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // Ejer.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // Ejer.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // Ejer.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // Ejer.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // Ejer.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // Ejer.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // Ejer.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // Ejer.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // Ejer.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // Ejer.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // Ejer.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // Ejer.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // Ejer.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // Ejer.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // Ejer.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // Ejer.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // Ejer.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // Ejer.g:1:232: P
                {
                mP(); 

                }
                break;
            case 39 :
                // Ejer.g:1:234: OPrelacional
                {
                mOPrelacional(); 

                }
                break;
            case 40 :
                // Ejer.g:1:247: ModificadorDeAcceso
                {
                mModificadorDeAcceso(); 

                }
                break;
            case 41 :
                // Ejer.g:1:267: ID
                {
                mID(); 

                }
                break;
            case 42 :
                // Ejer.g:1:270: STRI
                {
                mSTRI(); 

                }
                break;
            case 43 :
                // Ejer.g:1:275: ENT
                {
                mENT(); 

                }
                break;
            case 44 :
                // Ejer.g:1:279: FLOT
                {
                mFLOT(); 

                }
                break;
            case 45 :
                // Ejer.g:1:284: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\160\1\162\1\157\1\164\1\145\1\147\1\151\1\144\1\141\2\uffff";
    static final String DFA4_maxS =
        "\1\160\1\162\1\157\1\164\1\145\1\147\1\151\1\144\1\157\2\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\15\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "104:66: ( 'protegida' | 'protegido' )";
        }
    }
    static final String DFA12_eotS =
        "\1\36\1\35\10\uffff\3\35\1\54\1\56\1\60\1\35\1\62\1\63\5\35\1\72"+
        "\3\uffff\1\35\2\uffff\1\73\1\uffff\11\35\1\112\1\35\5\uffff\1\35"+
        "\2\uffff\6\35\3\uffff\15\35\1\uffff\12\35\1\153\23\35\1\177\1\35"+
        "\1\uffff\3\35\1\u0084\17\35\1\uffff\1\u0094\1\35\1\u0096\1\35\1"+
        "\uffff\1\u0098\6\35\1\u00a1\7\35\1\uffff\1\u00a9\1\uffff\1\35\1"+
        "\uffff\1\u00ab\1\35\2\u00ad\1\35\2\u00ad\1\35\1\uffff\2\35\1\u00b2"+
        "\4\35\1\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1\u00bb\1\u00bc\1\u00bd"+
        "\1\uffff\1\u00be\3\35\1\u00c2\1\35\2\u00ad\4\uffff\1\u00c4\2\35"+
        "\1\uffff\1\35\1\uffff\13\35\1\u00d3\2\35\1\uffff\3\35\1\u00d9\1"+
        "\35\1\uffff\4\35\1\u00df\1\uffff";
    static final String DFA12_eofS =
        "\u00e0\uffff";
    static final String DFA12_minS =
        "\1\11\1\141\10\uffff\3\141\1\60\1\53\1\55\1\141\2\60\2\141\1\170"+
        "\2\165\1\75\3\uffff\1\141\2\uffff\1\56\1\uffff\11\141\1\60\1\141"+
        "\5\uffff\1\141\2\uffff\3\141\1\143\1\154\1\156\3\uffff\15\141\1"+
        "\uffff\5\141\1\145\1\154\1\164\2\141\1\60\20\141\1\160\1\122\1\151"+
        "\1\60\1\141\1\uffff\3\141\1\60\14\141\1\164\1\145\1\155\1\uffff"+
        "\1\60\1\141\1\60\1\141\1\uffff\1\60\6\141\1\60\4\141\1\151\1\146"+
        "\1\145\1\uffff\1\60\1\uffff\1\141\1\uffff\1\60\1\141\2\60\1\141"+
        "\2\60\1\141\1\uffff\2\141\1\60\1\141\1\157\1\145\1\105\1\uffff\1"+
        "\141\1\uffff\1\141\1\uffff\1\141\3\60\1\uffff\1\60\1\156\1\162\1"+
        "\170\1\60\1\141\2\60\4\uffff\1\60\1\145\1\143\1\uffff\1\141\1\uffff"+
        "\1\156\1\145\1\141\1\143\1\160\1\141\1\145\1\164\1\141\1\105\1\151"+
        "\1\60\1\170\1\157\1\uffff\1\143\1\156\1\145\1\60\1\160\1\uffff\1"+
        "\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\172\10\uffff\4\172\1\53\1\55\5\172\1\170\2\165\1\75\3"+
        "\uffff\1\172\2\uffff\1\71\1\uffff\13\172\5\uffff\1\172\2\uffff\3"+
        "\172\1\143\1\154\1\156\3\uffff\15\172\1\uffff\5\172\1\145\1\154"+
        "\1\164\23\172\1\160\1\122\1\151\2\172\1\uffff\20\172\1\164\1\145"+
        "\1\155\1\uffff\4\172\1\uffff\14\172\1\151\1\146\1\145\1\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\10\172\1\uffff\4\172\1\157\1\145\1\105"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\156\1"+
        "\162\1\170\4\172\4\uffff\1\172\1\145\1\143\1\uffff\1\172\1\uffff"+
        "\1\156\1\145\1\172\1\143\1\160\1\172\1\145\1\164\1\172\1\105\1\151"+
        "\1\172\1\170\1\157\1\uffff\1\143\1\156\1\145\1\172\1\160\1\uffff"+
        "\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\11\1\12\1\13\17\uffff\1\42\1\46"+
        "\1\47\1\uffff\1\51\1\52\1\uffff\1\55\13\uffff\1\33\1\23\1\40\1\24"+
        "\1\41\1\uffff\1\26\1\27\6\uffff\1\37\1\53\1\54\15\uffff\1\16\40"+
        "\uffff\1\10\23\uffff\1\1\4\uffff\1\22\17\uffff\1\7\1\uffff\1\45"+
        "\1\uffff\1\14\10\uffff\1\43\7\uffff\1\32\1\uffff\1\21\1\uffff\1"+
        "\50\4\uffff\1\31\10\uffff\1\17\1\25\1\30\1\44\3\uffff\1\20\1\uffff"+
        "\1\34\16\uffff\1\15\5\uffff\1\36\5\uffff\1\35";
    static final String DFA12_specialS =
        "\u00e0\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\33\1\10\5\uffff\1\4\1\5"+
            "\1\31\1\16\1\6\1\17\1\32\1\uffff\12\37\1\7\1\11\1\33\1\30\1"+
            "\33\2\uffff\4\35\1\25\10\35\1\26\3\35\1\27\10\35\6\uffff\2\34"+
            "\1\1\1\34\1\15\1\24\2\34\1\23\3\34\1\20\1\34\1\22\1\13\1\34"+
            "\1\12\1\14\5\34\1\21\1\34\1\2\1\uffff\1\3",
            "\1\42\7\45\1\44\2\45\1\41\2\45\1\43\13\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\45\1\47\11\45\1\46\13\45",
            "\21\45\1\50\2\45\1\51\5\45",
            "\10\45\1\52\21\45",
            "\12\35\7\uffff\32\35\6\uffff\15\45\1\53\14\45",
            "\1\55",
            "\1\57",
            "\10\45\1\61\21\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\15\45\1\64\14\45",
            "\10\45\1\65\2\45\1\66\16\45",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\33",
            "",
            "",
            "",
            "\32\45",
            "",
            "",
            "\1\74\1\uffff\12\37",
            "",
            "\1\75\31\45",
            "\3\45\1\101\10\45\1\76\2\45\1\100\2\45\1\77\7\45",
            "\15\45\1\102\14\45",
            "\2\45\1\103\27\45",
            "\32\45",
            "\14\45\1\104\15\45",
            "\23\45\1\105\6\45",
            "\4\45\1\106\3\45\1\107\5\45\1\110\13\45",
            "\1\45\1\111\30\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\23\45\1\113\6\45",
            "",
            "",
            "",
            "",
            "",
            "\4\45\1\114\25\45",
            "",
            "",
            "\23\45\1\115\6\45",
            "\15\45\1\116\14\45",
            "\16\45\1\117\13\45",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "\22\45\1\123\7\45",
            "\1\45\1\124\30\45",
            "\16\45\1\125\13\45",
            "\23\45\1\126\6\45",
            "\4\45\1\127\25\45",
            "\23\45\1\130\6\45",
            "\13\45\1\131\16\45",
            "\17\45\1\132\12\45",
            "\16\45\1\133\13\45",
            "\3\45\1\134\26\45",
            "\25\45\1\135\4\45",
            "\23\45\1\136\6\45",
            "\13\45\1\137\16\45",
            "",
            "\4\45\1\141\11\45\1\140\13\45",
            "\15\45\1\142\14\45",
            "\4\45\1\143\25\45",
            "\1\144\31\45",
            "\23\45\1\145\6\45",
            "\1\146",
            "\1\147",
            "\1\150",
            "\4\45\1\151\25\45",
            "\10\45\1\152\21\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\24\45\1\154\5\45",
            "\15\45\1\155\14\45",
            "\21\45\1\156\10\45",
            "\16\45\1\157\13\45",
            "\4\45\1\160\25\45",
            "\21\45\1\161\10\45",
            "\4\45\1\162\25\45",
            "\1\163\31\45",
            "\4\45\1\164\25\45",
            "\10\45\1\165\21\45",
            "\15\45\1\166\14\45",
            "\21\45\1\167\10\45",
            "\23\45\1\170\6\45",
            "\15\45\1\171\14\45",
            "\13\45\1\172\16\45",
            "\1\173\31\45",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\16\45\1\u0080\13\45",
            "",
            "\21\45\1\u0081\10\45",
            "\1\u0082\31\45",
            "\1\u0083\31\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\21\45\1\u0085\10\45",
            "\15\45\1\u0086\14\45",
            "\23\45\1\u0087\6\45",
            "\3\45\1\u0088\26\45",
            "\6\45\1\u0089\23\45",
            "\2\45\1\u008a\27\45",
            "\2\45\1\u008b\27\45",
            "\16\45\1\u008c\13\45",
            "\21\45\1\u008d\10\45",
            "\23\45\1\u008e\6\45",
            "\13\45\1\u008f\16\45",
            "\15\45\1\u0090\14\45",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\1\u0095\31\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\21\45\1\u0097\10\45",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\16\45\1\u0099\13\45",
            "\4\45\1\u009a\25\45",
            "\1\u009b\15\45\1\u009c\13\45",
            "\10\45\1\u009d\21\45",
            "\1\u009e\15\45\1\u009f\13\45",
            "\4\45\1\u00a0\25\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\1\u00a2\31\45",
            "\1\u00a3\31\45",
            "\30\45\1\u00a4\1\45",
            "\23\45\1\u00a5\6\45",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "",
            "\10\45\1\u00aa\21\45",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\21\45\1\u00ac\10\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\3\45\1\u00ae\26\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\22\45\1\u00af\7\45",
            "",
            "\22\45\1\u00b0\7\45",
            "\21\45\1\u00b1\10\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\4\45\1\u00b3\25\45",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\16\45\1\u00b7\13\45",
            "",
            "\14\45\1\u00b8\15\45",
            "",
            "\1\u00b9\15\45\1\u00ba\13\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\10\45\1\u00c3\21\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\15\45\1\u00c7\14\45",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\31\45",
            "\1\u00cb",
            "\1\u00cc",
            "\3\45\1\u00cd\26\45",
            "\1\u00ce",
            "\1\u00cf",
            "\16\45\1\u00d0\13\45",
            "\1\u00d1",
            "\1\u00d2",
            "\12\35\7\uffff\32\35\6\uffff\32\45",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | P | OPrelacional | ModificadorDeAcceso | ID | STRI | ENT | FLOT | WS );";
        }
    }
 

}