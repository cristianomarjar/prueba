// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Ejer.g 2013-09-23 22:07:17

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class EjerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ModificadorDeAcceso", "ID", "P", "OPrelacional", "ENT", "FLOT", "STRI", "WS", "'clase'", "'{'", "'}'", "'('", "')'", "','", "'cambio'", "'caso'", "':'", "'\"'", "';'", "'romper'", "'predeterminado'", "'si'", "'entonces'", "'contrario'", "'retorno'", "'ciclo'", "'++'", "'--'", "'mientras'", "'y'", "'o'", "'intentar'", "'finally'", "'captura'", "'e'", "'Exception'", "'NullReferenceException'", "'RuntimeException'", "'='", "'+'", "'-'", "'*'", "'entero'", "'flotante'", "'cadena'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int STRI=10;
    public static final int T__21=21;
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


        public EjerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public EjerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return EjerParser.tokenNames; }
    public String getGrammarFileName() { return "Ejer.g"; }


    	public void displayRecognitionError(String[] tokenNames, RecognitionException e){    
       String hdr = getErrorHeader(e);  
       String msg = getErrorMessage(e, tokenNames);    
       System.out.println("Que te fijes!!!: " + hdr + " " + msg) ;
    }
    HashMap memory = new HashMap();



    // $ANTLR start "inicio"
    // Ejer.g:17:1: inicio : 'clase' ModificadorDeAcceso ID '{' ( declaraciones | metodo )* '}' ;
    public final void inicio() throws RecognitionException {
        try {
            // Ejer.g:17:9: ( 'clase' ModificadorDeAcceso ID '{' ( declaraciones | metodo )* '}' )
            // Ejer.g:17:11: 'clase' ModificadorDeAcceso ID '{' ( declaraciones | metodo )* '}'
            {
            match(input,12,FOLLOW_12_in_inicio30); if (state.failed) return ;
            match(input,ModificadorDeAcceso,FOLLOW_ModificadorDeAcceso_in_inicio32); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_inicio35); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_inicio37); if (state.failed) return ;
            // Ejer.g:17:46: ( declaraciones | metodo )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=46 && LA1_0<=48)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==ModificadorDeAcceso) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // Ejer.g:17:47: declaraciones
            	    {
            	    pushFollow(FOLLOW_declaraciones_in_inicio39);
            	    declaraciones();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Ejer.g:17:61: metodo
            	    {
            	    pushFollow(FOLLOW_metodo_in_inicio41);
            	    metodo();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_inicio44); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inicio"


    // $ANTLR start "metodo"
    // Ejer.g:20:1: metodo : ModificadorDeAcceso ( tipoEnt | tipoFlot | tipoString ) ID '(' ( argumentos )* ')' '{' ( instrucciones )+ '}' ;
    public final void metodo() throws RecognitionException {
        try {
            // Ejer.g:20:9: ( ModificadorDeAcceso ( tipoEnt | tipoFlot | tipoString ) ID '(' ( argumentos )* ')' '{' ( instrucciones )+ '}' )
            // Ejer.g:20:11: ModificadorDeAcceso ( tipoEnt | tipoFlot | tipoString ) ID '(' ( argumentos )* ')' '{' ( instrucciones )+ '}'
            {
            match(input,ModificadorDeAcceso,FOLLOW_ModificadorDeAcceso_in_metodo56); if (state.failed) return ;
            // Ejer.g:20:31: ( tipoEnt | tipoFlot | tipoString )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt2=1;
                }
                break;
            case 47:
                {
                alt2=2;
                }
                break;
            case 48:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Ejer.g:20:32: tipoEnt
                    {
                    pushFollow(FOLLOW_tipoEnt_in_metodo59);
                    tipoEnt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:20:40: tipoFlot
                    {
                    pushFollow(FOLLOW_tipoFlot_in_metodo61);
                    tipoFlot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Ejer.g:20:49: tipoString
                    {
                    pushFollow(FOLLOW_tipoString_in_metodo63);
                    tipoString();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,ID,FOLLOW_ID_in_metodo66); if (state.failed) return ;
            match(input,15,FOLLOW_15_in_metodo68); if (state.failed) return ;
            // Ejer.g:20:68: ( argumentos )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=46 && LA3_0<=48)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ejer.g:0:0: argumentos
            	    {
            	    pushFollow(FOLLOW_argumentos_in_metodo70);
            	    argumentos();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_metodo73); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_metodo75); if (state.failed) return ;
            // Ejer.g:20:87: ( instrucciones )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||LA4_0==18||LA4_0==25||(LA4_0>=28 && LA4_0<=29)||LA4_0==32||LA4_0==35||(LA4_0>=46 && LA4_0<=48)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Ejer.g:0:0: instrucciones
            	    {
            	    pushFollow(FOLLOW_instrucciones_in_metodo76);
            	    instrucciones();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,14,FOLLOW_14_in_metodo78); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "metodo"


    // $ANTLR start "argumentos"
    // Ejer.g:23:1: argumentos : ( declInt | declFlot | declString ) ( ',' ( declInt | declFlot | declString ) )* ;
    public final void argumentos() throws RecognitionException {
        try {
            // Ejer.g:23:12: ( ( declInt | declFlot | declString ) ( ',' ( declInt | declFlot | declString ) )* )
            // Ejer.g:23:14: ( declInt | declFlot | declString ) ( ',' ( declInt | declFlot | declString ) )*
            {
            // Ejer.g:23:14: ( declInt | declFlot | declString )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                alt5=2;
                }
                break;
            case 48:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // Ejer.g:23:15: declInt
                    {
                    pushFollow(FOLLOW_declInt_in_argumentos90);
                    declInt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:23:23: declFlot
                    {
                    pushFollow(FOLLOW_declFlot_in_argumentos92);
                    declFlot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Ejer.g:23:32: declString
                    {
                    pushFollow(FOLLOW_declString_in_argumentos94);
                    declString();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // Ejer.g:23:44: ( ',' ( declInt | declFlot | declString ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Ejer.g:23:45: ',' ( declInt | declFlot | declString )
            	    {
            	    match(input,17,FOLLOW_17_in_argumentos98); if (state.failed) return ;
            	    // Ejer.g:23:49: ( declInt | declFlot | declString )
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // Ejer.g:23:50: declInt
            	            {
            	            pushFollow(FOLLOW_declInt_in_argumentos101);
            	            declInt();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // Ejer.g:23:58: declFlot
            	            {
            	            pushFollow(FOLLOW_declFlot_in_argumentos103);
            	            declFlot();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // Ejer.g:23:67: declString
            	            {
            	            pushFollow(FOLLOW_declString_in_argumentos105);
            	            declString();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "argumentos"


    // $ANTLR start "instrucciones"
    // Ejer.g:26:1: instrucciones : ( declaraciones | asignacion | cambiar | ciclos | ifelse | ret | sis | bloque );
    public final void instrucciones() throws RecognitionException {
        try {
            // Ejer.g:26:14: ( declaraciones | asignacion | cambiar | ciclos | ifelse | ret | sis | bloque )
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // Ejer.g:26:16: declaraciones
                    {
                    pushFollow(FOLLOW_declaraciones_in_instrucciones121);
                    declaraciones();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:26:31: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_instrucciones124);
                    asignacion();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Ejer.g:26:44: cambiar
                    {
                    pushFollow(FOLLOW_cambiar_in_instrucciones128);
                    cambiar();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Ejer.g:26:54: ciclos
                    {
                    pushFollow(FOLLOW_ciclos_in_instrucciones132);
                    ciclos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Ejer.g:26:63: ifelse
                    {
                    pushFollow(FOLLOW_ifelse_in_instrucciones136);
                    ifelse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Ejer.g:26:72: ret
                    {
                    pushFollow(FOLLOW_ret_in_instrucciones140);
                    ret();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // Ejer.g:26:78: sis
                    {
                    pushFollow(FOLLOW_sis_in_instrucciones144);
                    sis();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // Ejer.g:26:84: bloque
                    {
                    pushFollow(FOLLOW_bloque_in_instrucciones148);
                    bloque();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "instrucciones"


    // $ANTLR start "cambiar"
    // Ejer.g:29:1: cambiar : 'cambio' '(' expr ')' '{' ( 'caso' ID ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones )* 'romper' ';' )+ ( 'predeterminado' ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones | cond )* 'romper' ';' )? '}' ;
    public final void cambiar() throws RecognitionException {
        try {
            // Ejer.g:29:10: ( 'cambio' '(' expr ')' '{' ( 'caso' ID ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones )* 'romper' ';' )+ ( 'predeterminado' ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones | cond )* 'romper' ';' )? '}' )
            // Ejer.g:29:12: 'cambio' '(' expr ')' '{' ( 'caso' ID ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones )* 'romper' ';' )+ ( 'predeterminado' ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones | cond )* 'romper' ';' )? '}'
            {
            match(input,18,FOLLOW_18_in_cambiar160); if (state.failed) return ;
            match(input,15,FOLLOW_15_in_cambiar161); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_cambiar163);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,16,FOLLOW_16_in_cambiar164); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_cambiar166); if (state.failed) return ;
            // Ejer.g:29:36: ( 'caso' ID ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones )* 'romper' ';' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Ejer.g:29:37: 'caso' ID ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones )* 'romper' ';'
            	    {
            	    match(input,19,FOLLOW_19_in_cambiar169); if (state.failed) return ;
            	    match(input,ID,FOLLOW_ID_in_cambiar171); if (state.failed) return ;
            	    match(input,20,FOLLOW_20_in_cambiar173); if (state.failed) return ;
            	    match(input,ID,FOLLOW_ID_in_cambiar175); if (state.failed) return ;
            	    match(input,15,FOLLOW_15_in_cambiar176); if (state.failed) return ;
            	    match(input,21,FOLLOW_21_in_cambiar177); if (state.failed) return ;
            	    match(input,ID,FOLLOW_ID_in_cambiar178); if (state.failed) return ;
            	    match(input,21,FOLLOW_21_in_cambiar179); if (state.failed) return ;
            	    match(input,16,FOLLOW_16_in_cambiar180); if (state.failed) return ;
            	    match(input,22,FOLLOW_22_in_cambiar182); if (state.failed) return ;
            	    // Ejer.g:29:72: ( instrucciones )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==ID||LA9_0==18||LA9_0==25||(LA9_0>=28 && LA9_0<=29)||LA9_0==32||LA9_0==35||(LA9_0>=46 && LA9_0<=48)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // Ejer.g:0:0: instrucciones
            	    	    {
            	    	    pushFollow(FOLLOW_instrucciones_in_cambiar184);
            	    	    instrucciones();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    match(input,23,FOLLOW_23_in_cambiar187); if (state.failed) return ;
            	    match(input,22,FOLLOW_22_in_cambiar189); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // Ejer.g:30:1: ( 'predeterminado' ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones | cond )* 'romper' ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Ejer.g:30:2: 'predeterminado' ':' ID '(' '\"' ID '\"' ')' ';' ( instrucciones | cond )* 'romper' ';'
                    {
                    match(input,24,FOLLOW_24_in_cambiar195); if (state.failed) return ;
                    match(input,20,FOLLOW_20_in_cambiar197); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_cambiar199); if (state.failed) return ;
                    match(input,15,FOLLOW_15_in_cambiar200); if (state.failed) return ;
                    match(input,21,FOLLOW_21_in_cambiar201); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_cambiar202); if (state.failed) return ;
                    match(input,21,FOLLOW_21_in_cambiar203); if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_cambiar204); if (state.failed) return ;
                    match(input,22,FOLLOW_22_in_cambiar206); if (state.failed) return ;
                    // Ejer.g:30:44: ( instrucciones | cond )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID||LA11_0==18||LA11_0==25||(LA11_0>=28 && LA11_0<=29)||LA11_0==32||LA11_0==35||(LA11_0>=46 && LA11_0<=48)) ) {
                            alt11=1;
                        }
                        else if ( (LA11_0==15) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Ejer.g:30:45: instrucciones
                    	    {
                    	    pushFollow(FOLLOW_instrucciones_in_cambiar209);
                    	    instrucciones();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ejer.g:30:61: cond
                    	    {
                    	    pushFollow(FOLLOW_cond_in_cambiar213);
                    	    cond();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_cambiar217); if (state.failed) return ;
                    match(input,22,FOLLOW_22_in_cambiar219); if (state.failed) return ;

                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_cambiar222); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cambiar"


    // $ANTLR start "ciclos"
    // Ejer.g:32:1: ciclos : ( para | while1 );
    public final void ciclos() throws RecognitionException {
        try {
            // Ejer.g:32:9: ( para | while1 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // Ejer.g:32:11: para
                    {
                    pushFollow(FOLLOW_para_in_ciclos232);
                    para();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:32:18: while1
                    {
                    pushFollow(FOLLOW_while1_in_ciclos236);
                    while1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ciclos"


    // $ANTLR start "ifelse"
    // Ejer.g:35:1: ifelse : 'si' cond 'entonces' ( cuerpo | instrucciones ) ( 'contrario' ( cuerpo | instrucciones ) )? ;
    public final void ifelse() throws RecognitionException {
        try {
            // Ejer.g:35:9: ( 'si' cond 'entonces' ( cuerpo | instrucciones ) ( 'contrario' ( cuerpo | instrucciones ) )? )
            // Ejer.g:35:11: 'si' cond 'entonces' ( cuerpo | instrucciones ) ( 'contrario' ( cuerpo | instrucciones ) )?
            {
            match(input,25,FOLLOW_25_in_ifelse248); if (state.failed) return ;
            pushFollow(FOLLOW_cond_in_ifelse250);
            cond();

            state._fsp--;
            if (state.failed) return ;
            match(input,26,FOLLOW_26_in_ifelse252); if (state.failed) return ;
            // Ejer.g:35:32: ( cuerpo | instrucciones )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID||LA14_0==18||LA14_0==25||(LA14_0>=28 && LA14_0<=29)||LA14_0==32||LA14_0==35||(LA14_0>=46 && LA14_0<=48)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // Ejer.g:35:33: cuerpo
                    {
                    pushFollow(FOLLOW_cuerpo_in_ifelse255);
                    cuerpo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:35:40: instrucciones
                    {
                    pushFollow(FOLLOW_instrucciones_in_ifelse257);
                    instrucciones();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // Ejer.g:35:55: ( 'contrario' ( cuerpo | instrucciones ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred27_Ejer()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // Ejer.g:35:56: 'contrario' ( cuerpo | instrucciones )
                    {
                    match(input,27,FOLLOW_27_in_ifelse261); if (state.failed) return ;
                    // Ejer.g:35:68: ( cuerpo | instrucciones )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==13) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==ID||LA15_0==18||LA15_0==25||(LA15_0>=28 && LA15_0<=29)||LA15_0==32||LA15_0==35||(LA15_0>=46 && LA15_0<=48)) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // Ejer.g:35:69: cuerpo
                            {
                            pushFollow(FOLLOW_cuerpo_in_ifelse264);
                            cuerpo();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Ejer.g:35:76: instrucciones
                            {
                            pushFollow(FOLLOW_instrucciones_in_ifelse266);
                            instrucciones();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifelse"


    // $ANTLR start "ret"
    // Ejer.g:38:1: ret : 'retorno' atomo ';' ;
    public final void ret() throws RecognitionException {
        try {
            // Ejer.g:38:6: ( 'retorno' atomo ';' )
            // Ejer.g:38:8: 'retorno' atomo ';'
            {
            match(input,28,FOLLOW_28_in_ret280); if (state.failed) return ;
            pushFollow(FOLLOW_atomo_in_ret282);
            atomo();

            state._fsp--;
            if (state.failed) return ;
            match(input,22,FOLLOW_22_in_ret284); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ret"


    // $ANTLR start "sis"
    // Ejer.g:41:1: sis : ID ( P ID )* ( '(' ( mExpr )? ')' )? ';' ;
    public final void sis() throws RecognitionException {
        try {
            // Ejer.g:41:8: ( ID ( P ID )* ( '(' ( mExpr )? ')' )? ';' )
            // Ejer.g:41:10: ID ( P ID )* ( '(' ( mExpr )? ')' )? ';'
            {
            match(input,ID,FOLLOW_ID_in_sis297); if (state.failed) return ;
            // Ejer.g:41:13: ( P ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==P) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Ejer.g:41:14: P ID
            	    {
            	    match(input,P,FOLLOW_P_in_sis300); if (state.failed) return ;
            	    match(input,ID,FOLLOW_ID_in_sis302); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // Ejer.g:41:22: ( '(' ( mExpr )? ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Ejer.g:41:23: '(' ( mExpr )? ')'
                    {
                    match(input,15,FOLLOW_15_in_sis308); if (state.failed) return ;
                    // Ejer.g:41:29: ( mExpr )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ID||(LA18_0>=ENT && LA18_0<=STRI)||LA18_0==15||LA18_0==21) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Ejer.g:0:0: mExpr
                            {
                            pushFollow(FOLLOW_mExpr_in_sis312);
                            mExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_sis315); if (state.failed) return ;

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_sis320); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sis"


    // $ANTLR start "para"
    // Ejer.g:46:1: para : 'ciclo' '(' asignacion eRR ';' ID ( '++' | '--' | asignacion ) ')' '{' ( instrucciones )* '}' ;
    public final void para() throws RecognitionException {
        try {
            // Ejer.g:46:7: ( 'ciclo' '(' asignacion eRR ';' ID ( '++' | '--' | asignacion ) ')' '{' ( instrucciones )* '}' )
            // Ejer.g:46:9: 'ciclo' '(' asignacion eRR ';' ID ( '++' | '--' | asignacion ) ')' '{' ( instrucciones )* '}'
            {
            match(input,29,FOLLOW_29_in_para347); if (state.failed) return ;
            match(input,15,FOLLOW_15_in_para349); if (state.failed) return ;
            pushFollow(FOLLOW_asignacion_in_para351);
            asignacion();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eRR_in_para353);
            eRR();

            state._fsp--;
            if (state.failed) return ;
            match(input,22,FOLLOW_22_in_para355); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_para357); if (state.failed) return ;
            // Ejer.g:46:43: ( '++' | '--' | asignacion )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case ID:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // Ejer.g:46:44: '++'
                    {
                    match(input,30,FOLLOW_30_in_para360); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:46:49: '--'
                    {
                    match(input,31,FOLLOW_31_in_para362); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Ejer.g:46:54: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_para364);
                    asignacion();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_para367); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_para369); if (state.failed) return ;
            // Ejer.g:46:74: ( instrucciones )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ID||LA21_0==18||LA21_0==25||(LA21_0>=28 && LA21_0<=29)||LA21_0==32||LA21_0==35||(LA21_0>=46 && LA21_0<=48)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Ejer.g:46:75: instrucciones
            	    {
            	    pushFollow(FOLLOW_instrucciones_in_para372);
            	    instrucciones();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_para376); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "para"


    // $ANTLR start "while1"
    // Ejer.g:49:1: while1 : 'mientras' ( cond ) '{' ( instrucciones )* '}' ;
    public final void while1() throws RecognitionException {
        try {
            // Ejer.g:49:9: ( 'mientras' ( cond ) '{' ( instrucciones )* '}' )
            // Ejer.g:49:11: 'mientras' ( cond ) '{' ( instrucciones )* '}'
            {
            match(input,32,FOLLOW_32_in_while1388); if (state.failed) return ;
            // Ejer.g:49:22: ( cond )
            // Ejer.g:49:23: cond
            {
            pushFollow(FOLLOW_cond_in_while1391);
            cond();

            state._fsp--;
            if (state.failed) return ;

            }

            match(input,13,FOLLOW_13_in_while1394); if (state.failed) return ;
            // Ejer.g:49:33: ( instrucciones )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID||LA22_0==18||LA22_0==25||(LA22_0>=28 && LA22_0<=29)||LA22_0==32||LA22_0==35||(LA22_0>=46 && LA22_0<=48)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Ejer.g:49:34: instrucciones
            	    {
            	    pushFollow(FOLLOW_instrucciones_in_while1397);
            	    instrucciones();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_while1402); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "while1"


    // $ANTLR start "cuerpo"
    // Ejer.g:52:1: cuerpo : '{' ( instrucciones )* '}' ;
    public final void cuerpo() throws RecognitionException {
        try {
            // Ejer.g:52:9: ( '{' ( instrucciones )* '}' )
            // Ejer.g:52:11: '{' ( instrucciones )* '}'
            {
            match(input,13,FOLLOW_13_in_cuerpo414); if (state.failed) return ;
            // Ejer.g:52:14: ( instrucciones )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ID||LA23_0==18||LA23_0==25||(LA23_0>=28 && LA23_0<=29)||LA23_0==32||LA23_0==35||(LA23_0>=46 && LA23_0<=48)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Ejer.g:0:0: instrucciones
            	    {
            	    pushFollow(FOLLOW_instrucciones_in_cuerpo415);
            	    instrucciones();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_cuerpo417); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cuerpo"


    // $ANTLR start "cond"
    // Ejer.g:56:1: cond : ( '(' e ')' | eR );
    public final void cond() throws RecognitionException {
        try {
            // Ejer.g:56:13: ( '(' e ')' | eR )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred36_Ejer()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // Ejer.g:56:15: '(' e ')'
                    {
                    match(input,15,FOLLOW_15_in_cond438); if (state.failed) return ;
                    pushFollow(FOLLOW_e_in_cond440);
                    e();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_cond442); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:56:27: eR
                    {
                    pushFollow(FOLLOW_eR_in_cond446);
                    eR();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cond"


    // $ANTLR start "e"
    // Ejer.g:58:1: e : cond ( ( 'y' | 'o' ) cond )* ;
    public final void e() throws RecognitionException {
        try {
            // Ejer.g:58:13: ( cond ( ( 'y' | 'o' ) cond )* )
            // Ejer.g:58:15: cond ( ( 'y' | 'o' ) cond )*
            {
            pushFollow(FOLLOW_cond_in_e479);
            cond();

            state._fsp--;
            if (state.failed) return ;
            // Ejer.g:58:20: ( ( 'y' | 'o' ) cond )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Ejer.g:58:21: ( 'y' | 'o' ) cond
            	    {
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_cond_in_e489);
            	    cond();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "e"


    // $ANTLR start "eR"
    // Ejer.g:60:1: eR : '(' atomo OPrelacional atomo ')' ;
    public final void eR() throws RecognitionException {
        try {
            // Ejer.g:60:13: ( '(' atomo OPrelacional atomo ')' )
            // Ejer.g:60:15: '(' atomo OPrelacional atomo ')'
            {
            match(input,15,FOLLOW_15_in_eR514); if (state.failed) return ;
            pushFollow(FOLLOW_atomo_in_eR516);
            atomo();

            state._fsp--;
            if (state.failed) return ;
            match(input,OPrelacional,FOLLOW_OPrelacional_in_eR518); if (state.failed) return ;
            pushFollow(FOLLOW_atomo_in_eR520);
            atomo();

            state._fsp--;
            if (state.failed) return ;
            match(input,16,FOLLOW_16_in_eR522); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "eR"


    // $ANTLR start "eRR"
    // Ejer.g:63:1: eRR : atomo OPrelacional atomo ;
    public final void eRR() throws RecognitionException {
        try {
            // Ejer.g:63:7: ( atomo OPrelacional atomo )
            // Ejer.g:63:9: atomo OPrelacional atomo
            {
            pushFollow(FOLLOW_atomo_in_eRR536);
            atomo();

            state._fsp--;
            if (state.failed) return ;
            match(input,OPrelacional,FOLLOW_OPrelacional_in_eRR538); if (state.failed) return ;
            pushFollow(FOLLOW_atomo_in_eRR540);
            atomo();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "eRR"


    // $ANTLR start "bloque"
    // Ejer.g:70:1: bloque : 'intentar' cuerpo ( catche )+ ( 'finally' cuerpo )* ;
    public final void bloque() throws RecognitionException {
        try {
            // Ejer.g:70:9: ( 'intentar' cuerpo ( catche )+ ( 'finally' cuerpo )* )
            // Ejer.g:70:11: 'intentar' cuerpo ( catche )+ ( 'finally' cuerpo )*
            {
            match(input,35,FOLLOW_35_in_bloque582); if (state.failed) return ;
            pushFollow(FOLLOW_cuerpo_in_bloque584);
            cuerpo();

            state._fsp--;
            if (state.failed) return ;
            // Ejer.g:70:29: ( catche )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Ejer.g:0:0: catche
            	    {
            	    pushFollow(FOLLOW_catche_in_bloque586);
            	    catche();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // Ejer.g:70:37: ( 'finally' cuerpo )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Ejer.g:70:39: 'finally' cuerpo
            	    {
            	    match(input,36,FOLLOW_36_in_bloque591); if (state.failed) return ;
            	    pushFollow(FOLLOW_cuerpo_in_bloque593);
            	    cuerpo();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "bloque"


    // $ANTLR start "catche"
    // Ejer.g:72:1: catche : 'captura' '(' exepcion 'e' ')' cuerpo ;
    public final void catche() throws RecognitionException {
        try {
            // Ejer.g:72:9: ( 'captura' '(' exepcion 'e' ')' cuerpo )
            // Ejer.g:72:11: 'captura' '(' exepcion 'e' ')' cuerpo
            {
            match(input,37,FOLLOW_37_in_catche612); if (state.failed) return ;
            match(input,15,FOLLOW_15_in_catche614); if (state.failed) return ;
            pushFollow(FOLLOW_exepcion_in_catche616);
            exepcion();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_catche618); if (state.failed) return ;
            match(input,16,FOLLOW_16_in_catche620); if (state.failed) return ;
            pushFollow(FOLLOW_cuerpo_in_catche622);
            cuerpo();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "catche"


    // $ANTLR start "exepcion"
    // Ejer.g:74:1: exepcion : ( 'Exception' | 'NullReferenceException' | 'RuntimeException' );
    public final void exepcion() throws RecognitionException {
        try {
            // Ejer.g:74:10: ( 'Exception' | 'NullReferenceException' | 'RuntimeException' )
            // Ejer.g:
            {
            if ( (input.LA(1)>=39 && input.LA(1)<=41) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exepcion"


    // $ANTLR start "declaraciones"
    // Ejer.g:77:1: declaraciones : ( declInt | declFlot | declString );
    public final void declaraciones() throws RecognitionException {
        try {
            // Ejer.g:77:14: ( declInt | declFlot | declString )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt28=1;
                }
                break;
            case 47:
                {
                alt28=2;
                }
                break;
            case 48:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // Ejer.g:77:16: declInt
                    {
                    pushFollow(FOLLOW_declInt_in_declaraciones642);
                    declInt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Ejer.g:77:26: declFlot
                    {
                    pushFollow(FOLLOW_declFlot_in_declaraciones646);
                    declFlot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Ejer.g:77:37: declString
                    {
                    pushFollow(FOLLOW_declString_in_declaraciones650);
                    declString();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaraciones"


    // $ANTLR start "declInt"
    // Ejer.g:79:1: declInt : tipoEnt t1= ID ( ',' t2= ID )* ( ';' )? ;
    public final void declInt() throws RecognitionException {
        Token t1=null;
        Token t2=null;

        try {
            // Ejer.g:79:8: ( tipoEnt t1= ID ( ',' t2= ID )* ( ';' )? )
            // Ejer.g:79:10: tipoEnt t1= ID ( ',' t2= ID )* ( ';' )?
            {
            pushFollow(FOLLOW_tipoEnt_in_declInt658);
            tipoEnt();

            state._fsp--;
            if (state.failed) return ;
            t1=(Token)match(input,ID,FOLLOW_ID_in_declInt662); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               System.out.println("var int: "+(t1!=null?t1.getText():null)); memory.put((t1!=null?t1.getText():null), new Integer(1));  
            }
            // Ejer.g:80:3: ( ',' t2= ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==ID) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // Ejer.g:80:4: ',' t2= ID
            	    {
            	    match(input,17,FOLLOW_17_in_declInt670); if (state.failed) return ;
            	    t2=(Token)match(input,ID,FOLLOW_ID_in_declInt675); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       System.out.println("var int: "+(t2!=null?t2.getText():null)); memory.put((t2!=null?t2.getText():null), new Integer(1));  
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // Ejer.g:80:106: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Ejer.g:0:0: ';'
                    {
                    match(input,22,FOLLOW_22_in_declInt685); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declInt"


    // $ANTLR start "declFlot"
    // Ejer.g:82:1: declFlot : tipoFlot t1= ID ( ',' t2= ID )* ( ';' )? ;
    public final void declFlot() throws RecognitionException {
        Token t1=null;
        Token t2=null;

        try {
            // Ejer.g:82:9: ( tipoFlot t1= ID ( ',' t2= ID )* ( ';' )? )
            // Ejer.g:82:11: tipoFlot t1= ID ( ',' t2= ID )* ( ';' )?
            {
            pushFollow(FOLLOW_tipoFlot_in_declFlot696);
            tipoFlot();

            state._fsp--;
            if (state.failed) return ;
            t1=(Token)match(input,ID,FOLLOW_ID_in_declFlot700); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               System.out.println("var flot: "+(t1!=null?t1.getText():null)); memory.put((t1!=null?t1.getText():null), new Integer(2));  
            }
            // Ejer.g:83:3: ( ',' t2= ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==ID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // Ejer.g:83:4: ',' t2= ID
            	    {
            	    match(input,17,FOLLOW_17_in_declFlot708); if (state.failed) return ;
            	    t2=(Token)match(input,ID,FOLLOW_ID_in_declFlot713); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       System.out.println("var flot: "+(t2!=null?t2.getText():null)); memory.put((t2!=null?t2.getText():null), new Integer(2));  
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // Ejer.g:83:107: ( ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Ejer.g:0:0: ';'
                    {
                    match(input,22,FOLLOW_22_in_declFlot723); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declFlot"


    // $ANTLR start "declString"
    // Ejer.g:85:1: declString : tipoString t1= ID ( ',' t2= ID )* ( ';' )? ;
    public final void declString() throws RecognitionException {
        Token t1=null;
        Token t2=null;

        try {
            // Ejer.g:85:11: ( tipoString t1= ID ( ',' t2= ID )* ( ';' )? )
            // Ejer.g:85:13: tipoString t1= ID ( ',' t2= ID )* ( ';' )?
            {
            pushFollow(FOLLOW_tipoString_in_declString736);
            tipoString();

            state._fsp--;
            if (state.failed) return ;
            t1=(Token)match(input,ID,FOLLOW_ID_in_declString740); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               System.out.println("var string: "+(t1!=null?t1.getText():null)); memory.put((t1!=null?t1.getText():null), new Integer(3));  
            }
            // Ejer.g:86:3: ( ',' t2= ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==ID) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // Ejer.g:86:4: ',' t2= ID
            	    {
            	    match(input,17,FOLLOW_17_in_declString748); if (state.failed) return ;
            	    t2=(Token)match(input,ID,FOLLOW_ID_in_declString753); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       System.out.println("var string: "+(t2!=null?t2.getText():null)); memory.put((t2!=null?t2.getText():null), new Integer(3));  
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // Ejer.g:86:109: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Ejer.g:0:0: ';'
                    {
                    match(input,22,FOLLOW_22_in_declString763); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declString"


    // $ANTLR start "asignacion"
    // Ejer.g:88:1: asignacion : ID '=' expr ';' ;
    public final void asignacion() throws RecognitionException {
        Token ID1=null;
        EjerParser.expr_return expr2 = null;


        try {
            // Ejer.g:88:11: ( ID '=' expr ';' )
            // Ejer.g:88:13: ID '=' expr ';'
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_asignacion776); if (state.failed) return ;
            match(input,42,FOLLOW_42_in_asignacion778); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_asignacion780);
            expr2=expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,22,FOLLOW_22_in_asignacion782); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              Integer t= (Integer)memory.get((ID1!=null?ID1.getText():null));
                                           if (t==null) System.out.println("Variable no declarada: " +(ID1!=null?ID1.getText():null)); 
              							 else {int tipoexpr=(expr2!=null?expr2.valor:0); 
              								if (t.intValue()!=tipoexpr) 
              								System.out.println("Error de tipos en asignacion: "+(ID1!=null?ID1.getText():null) + "=" + (expr2!=null?input.toString(expr2.start,expr2.stop):null));} 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "asignacion"

    public static class expr_return extends ParserRuleReturnScope {
        public int valor;
    };

    // $ANTLR start "expr"
    // Ejer.g:94:1: expr returns [int valor] : t1= mExpr ( ( '+' | '-' ) t2= mExpr )* ;
    public final EjerParser.expr_return expr() throws RecognitionException {
        EjerParser.expr_return retval = new EjerParser.expr_return();
        retval.start = input.LT(1);

        EjerParser.mExpr_return t1 = null;

        EjerParser.mExpr_return t2 = null;


        try {
            // Ejer.g:94:25: (t1= mExpr ( ( '+' | '-' ) t2= mExpr )* )
            // Ejer.g:94:27: t1= mExpr ( ( '+' | '-' ) t2= mExpr )*
            {
            pushFollow(FOLLOW_mExpr_in_expr802);
            t1=mExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.valor =(t1!=null?t1.valor:0);
            }
            // Ejer.g:94:58: ( ( '+' | '-' ) t2= mExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=43 && LA35_0<=44)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Ejer.g:94:59: ( '+' | '-' ) t2= mExpr
            	    {
            	    if ( (input.LA(1)>=43 && input.LA(1)<=44) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mExpr_in_expr817);
            	    t2=mExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      if ((t1!=null?t1.valor:0)!=(t2!=null?t2.valor:0)){System.out.println
            	      							("Error de tipos: " +(t1!=null?input.toString(t1.start,t1.stop):null)+ " + o - " +(t2!=null?input.toString(t2.start,t2.stop):null)); retval.valor =3;} else {retval.valor =(t1!=null?t1.valor:0);}
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class mExpr_return extends ParserRuleReturnScope {
        public int valor;
    };

    // $ANTLR start "mExpr"
    // Ejer.g:97:1: mExpr returns [int valor] : t1= atomo ( '*' t2= atomo )* ;
    public final EjerParser.mExpr_return mExpr() throws RecognitionException {
        EjerParser.mExpr_return retval = new EjerParser.mExpr_return();
        retval.start = input.LT(1);

        EjerParser.atomo_return t1 = null;

        EjerParser.atomo_return t2 = null;


        try {
            // Ejer.g:97:26: (t1= atomo ( '*' t2= atomo )* )
            // Ejer.g:97:28: t1= atomo ( '*' t2= atomo )*
            {
            pushFollow(FOLLOW_atomo_in_mExpr846);
            t1=atomo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.valor =(t1!=null?t1.valor:0);
            }
            // Ejer.g:97:59: ( '*' t2= atomo )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==45) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Ejer.g:97:60: '*' t2= atomo
            	    {
            	    match(input,45,FOLLOW_45_in_mExpr851); if (state.failed) return retval;
            	    pushFollow(FOLLOW_atomo_in_mExpr855);
            	    t2=atomo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      if ((t1!=null?t1.valor:0)!=(t2!=null?t2.valor:0)){System.out.println
            	      							("Error de tipos: " +(t1!=null?input.toString(t1.start,t1.stop):null)+ " * " +(t2!=null?input.toString(t2.start,t2.stop):null)); retval.valor =3;} else {retval.valor =(t1!=null?t1.valor:0);}
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mExpr"

    public static class atomo_return extends ParserRuleReturnScope {
        public int valor;
    };

    // $ANTLR start "atomo"
    // Ejer.g:100:1: atomo returns [int valor] : ( msg | ENT | FLOT | STRI | ID | '(' expr ')' );
    public final EjerParser.atomo_return atomo() throws RecognitionException {
        EjerParser.atomo_return retval = new EjerParser.atomo_return();
        retval.start = input.LT(1);

        Token ID3=null;
        EjerParser.expr_return expr4 = null;


        try {
            // Ejer.g:100:26: ( msg | ENT | FLOT | STRI | ID | '(' expr ')' )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt37=1;
                }
                break;
            case ID:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==P) ) {
                    alt37=1;
                }
                else if ( (LA37_2==EOF||LA37_2==OPrelacional||LA37_2==16||LA37_2==22||(LA37_2>=43 && LA37_2<=45)) ) {
                    alt37=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case ENT:
                {
                alt37=2;
                }
                break;
            case FLOT:
                {
                alt37=3;
                }
                break;
            case STRI:
                {
                alt37=4;
                }
                break;
            case 15:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // Ejer.g:100:28: msg
                    {
                    pushFollow(FOLLOW_msg_in_atomo879);
                    msg();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Ejer.g:100:33: ENT
                    {
                    match(input,ENT,FOLLOW_ENT_in_atomo882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.valor = 1;
                    }

                    }
                    break;
                case 3 :
                    // Ejer.g:100:53: FLOT
                    {
                    match(input,FLOT,FOLLOW_FLOT_in_atomo888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.valor = 2;
                    }

                    }
                    break;
                case 4 :
                    // Ejer.g:100:74: STRI
                    {
                    match(input,STRI,FOLLOW_STRI_in_atomo894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.valor = 4;
                    }

                    }
                    break;
                case 5 :
                    // Ejer.g:100:95: ID
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_atomo900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      Integer t = (Integer)memory.get((ID3!=null?ID3.getText():null));
                      						  if(t==null)System.out.println("Variable no declarada: "+ (ID3!=null?ID3.getText():null)); else retval.valor = t.intValue();
                    }

                    }
                    break;
                case 6 :
                    // Ejer.g:102:11: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_atomo915); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atomo917);
                    expr4=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_atomo919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.valor = (expr4!=null?expr4.valor:0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomo"


    // $ANTLR start "tipoEnt"
    // Ejer.g:106:1: tipoEnt : 'entero' ;
    public final void tipoEnt() throws RecognitionException {
        try {
            // Ejer.g:106:10: ( 'entero' )
            // Ejer.g:106:12: 'entero'
            {
            match(input,46,FOLLOW_46_in_tipoEnt972); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tipoEnt"


    // $ANTLR start "tipoFlot"
    // Ejer.g:107:1: tipoFlot : 'flotante' ;
    public final void tipoFlot() throws RecognitionException {
        try {
            // Ejer.g:107:10: ( 'flotante' )
            // Ejer.g:107:12: 'flotante'
            {
            match(input,47,FOLLOW_47_in_tipoFlot980); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tipoFlot"


    // $ANTLR start "tipoString"
    // Ejer.g:108:1: tipoString : 'cadena' ;
    public final void tipoString() throws RecognitionException {
        try {
            // Ejer.g:108:12: ( 'cadena' )
            // Ejer.g:108:14: 'cadena'
            {
            match(input,48,FOLLOW_48_in_tipoString987); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tipoString"


    // $ANTLR start "msg"
    // Ejer.g:110:1: msg : ( '\"' ID '\"' ( p2 '\"' ID '\"' | p2 ID '.' ID )* | ID '.' ID ( p2 '\"' ID '\"' | p2 ID '.' ID )* );
    public final void msg() throws RecognitionException {
        try {
            // Ejer.g:110:4: ( '\"' ID '\"' ( p2 '\"' ID '\"' | p2 ID '.' ID )* | ID '.' ID ( p2 '\"' ID '\"' | p2 ID '.' ID )* )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            else if ( (LA40_0==ID) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // Ejer.g:110:6: '\"' ID '\"' ( p2 '\"' ID '\"' | p2 ID '.' ID )*
                    {
                    match(input,21,FOLLOW_21_in_msg994); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_msg995); if (state.failed) return ;
                    match(input,21,FOLLOW_21_in_msg996); if (state.failed) return ;
                    // Ejer.g:110:15: ( p2 '\"' ID '\"' | p2 ID '.' ID )*
                    loop38:
                    do {
                        int alt38=3;
                        alt38 = dfa38.predict(input);
                        switch (alt38) {
                    	case 1 :
                    	    // Ejer.g:110:16: p2 '\"' ID '\"'
                    	    {
                    	    pushFollow(FOLLOW_p2_in_msg999);
                    	    p2();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    match(input,21,FOLLOW_21_in_msg1001); if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_msg1002); if (state.failed) return ;
                    	    match(input,21,FOLLOW_21_in_msg1003); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ejer.g:110:31: p2 ID '.' ID
                    	    {
                    	    pushFollow(FOLLOW_p2_in_msg1008);
                    	    p2();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_msg1010); if (state.failed) return ;
                    	    match(input,P,FOLLOW_P_in_msg1012); if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_msg1014); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ejer.g:110:49: ID '.' ID ( p2 '\"' ID '\"' | p2 ID '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_msg1021); if (state.failed) return ;
                    match(input,P,FOLLOW_P_in_msg1023); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_msg1025); if (state.failed) return ;
                    // Ejer.g:110:59: ( p2 '\"' ID '\"' | p2 ID '.' ID )*
                    loop39:
                    do {
                        int alt39=3;
                        alt39 = dfa39.predict(input);
                        switch (alt39) {
                    	case 1 :
                    	    // Ejer.g:110:60: p2 '\"' ID '\"'
                    	    {
                    	    pushFollow(FOLLOW_p2_in_msg1028);
                    	    p2();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    match(input,21,FOLLOW_21_in_msg1030); if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_msg1031); if (state.failed) return ;
                    	    match(input,21,FOLLOW_21_in_msg1032); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ejer.g:110:75: p2 ID '.' ID
                    	    {
                    	    pushFollow(FOLLOW_p2_in_msg1037);
                    	    p2();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_msg1039); if (state.failed) return ;
                    	    match(input,P,FOLLOW_P_in_msg1041); if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_msg1043); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "msg"


    // $ANTLR start "p2"
    // Ejer.g:113:1: p2 : '+' ;
    public final void p2() throws RecognitionException {
        try {
            // Ejer.g:113:3: ( '+' )
            // Ejer.g:113:5: '+'
            {
            match(input,43,FOLLOW_43_in_p21055); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "p2"

    // $ANTLR start synpred27_Ejer
    public final void synpred27_Ejer_fragment() throws RecognitionException {   
        // Ejer.g:35:56: ( 'contrario' ( cuerpo | instrucciones ) )
        // Ejer.g:35:56: 'contrario' ( cuerpo | instrucciones )
        {
        match(input,27,FOLLOW_27_in_synpred27_Ejer261); if (state.failed) return ;
        // Ejer.g:35:68: ( cuerpo | instrucciones )
        int alt44=2;
        int LA44_0 = input.LA(1);

        if ( (LA44_0==13) ) {
            alt44=1;
        }
        else if ( (LA44_0==ID||LA44_0==18||LA44_0==25||(LA44_0>=28 && LA44_0<=29)||LA44_0==32||LA44_0==35||(LA44_0>=46 && LA44_0<=48)) ) {
            alt44=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 44, 0, input);

            throw nvae;
        }
        switch (alt44) {
            case 1 :
                // Ejer.g:35:69: cuerpo
                {
                pushFollow(FOLLOW_cuerpo_in_synpred27_Ejer264);
                cuerpo();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Ejer.g:35:76: instrucciones
                {
                pushFollow(FOLLOW_instrucciones_in_synpred27_Ejer266);
                instrucciones();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred27_Ejer

    // $ANTLR start synpred36_Ejer
    public final void synpred36_Ejer_fragment() throws RecognitionException {   
        // Ejer.g:56:15: ( '(' e ')' )
        // Ejer.g:56:15: '(' e ')'
        {
        match(input,15,FOLLOW_15_in_synpred36_Ejer438); if (state.failed) return ;
        pushFollow(FOLLOW_e_in_synpred36_Ejer440);
        e();

        state._fsp--;
        if (state.failed) return ;
        match(input,16,FOLLOW_16_in_synpred36_Ejer442); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Ejer

    // $ANTLR start synpred59_Ejer
    public final void synpred59_Ejer_fragment() throws RecognitionException {   
        // Ejer.g:110:16: ( p2 '\"' ID '\"' )
        // Ejer.g:110:16: p2 '\"' ID '\"'
        {
        pushFollow(FOLLOW_p2_in_synpred59_Ejer999);
        p2();

        state._fsp--;
        if (state.failed) return ;
        match(input,21,FOLLOW_21_in_synpred59_Ejer1001); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred59_Ejer1002); if (state.failed) return ;
        match(input,21,FOLLOW_21_in_synpred59_Ejer1003); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Ejer

    // $ANTLR start synpred60_Ejer
    public final void synpred60_Ejer_fragment() throws RecognitionException {   
        // Ejer.g:110:31: ( p2 ID '.' ID )
        // Ejer.g:110:31: p2 ID '.' ID
        {
        pushFollow(FOLLOW_p2_in_synpred60_Ejer1008);
        p2();

        state._fsp--;
        if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred60_Ejer1010); if (state.failed) return ;
        match(input,P,FOLLOW_P_in_synpred60_Ejer1012); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred60_Ejer1014); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Ejer

    // $ANTLR start synpred62_Ejer
    public final void synpred62_Ejer_fragment() throws RecognitionException {   
        // Ejer.g:110:60: ( p2 '\"' ID '\"' )
        // Ejer.g:110:60: p2 '\"' ID '\"'
        {
        pushFollow(FOLLOW_p2_in_synpred62_Ejer1028);
        p2();

        state._fsp--;
        if (state.failed) return ;
        match(input,21,FOLLOW_21_in_synpred62_Ejer1030); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred62_Ejer1031); if (state.failed) return ;
        match(input,21,FOLLOW_21_in_synpred62_Ejer1032); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_Ejer

    // $ANTLR start synpred63_Ejer
    public final void synpred63_Ejer_fragment() throws RecognitionException {   
        // Ejer.g:110:75: ( p2 ID '.' ID )
        // Ejer.g:110:75: p2 ID '.' ID
        {
        pushFollow(FOLLOW_p2_in_synpred63_Ejer1037);
        p2();

        state._fsp--;
        if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred63_Ejer1039); if (state.failed) return ;
        match(input,P,FOLLOW_P_in_synpred63_Ejer1041); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred63_Ejer1043); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Ejer

    // Delegated rules

    public final boolean synpred59_Ejer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Ejer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_Ejer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_Ejer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_Ejer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_Ejer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Ejer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Ejer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Ejer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Ejer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Ejer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Ejer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\5\1\uffff\1\6\7\uffff";
    static final String DFA8_maxS =
        "\1\60\1\uffff\1\52\7\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\10\1\2\1\7";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\14\uffff\1\3\6\uffff\1\5\2\uffff\1\6\1\4\2\uffff\1\4\2"+
            "\uffff\1\7\12\uffff\3\1",
            "",
            "\1\11\10\uffff\1\11\6\uffff\1\11\23\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "26:1: instrucciones : ( declaraciones | asignacion | cambiar | ciclos | ifelse | ret | sis | bloque );";
        }
    }
    static final String DFA38_eotS =
        "\13\uffff";
    static final String DFA38_eofS =
        "\1\1\12\uffff";
    static final String DFA38_minS =
        "\1\7\1\uffff\2\5\1\6\1\25\1\5\2\0\2\uffff";
    static final String DFA38_maxS =
        "\1\55\1\uffff\1\25\1\5\1\55\1\25\1\5\2\0\2\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\3\7\uffff\1\1\1\2";
    static final String DFA38_specialS =
        "\7\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\10\uffff\1\1\5\uffff\1\1\24\uffff\1\2\2\1",
            "",
            "\1\4\2\uffff\3\1\4\uffff\1\1\5\uffff\1\3",
            "\1\5",
            "\1\6\11\uffff\1\1\5\uffff\1\1\24\uffff\3\1",
            "\1\7",
            "\1\10",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 110:15: ( p2 '\"' ID '\"' | p2 ID '.' ID )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Ejer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Ejer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\13\uffff";
    static final String DFA39_eofS =
        "\1\1\12\uffff";
    static final String DFA39_minS =
        "\1\7\1\uffff\2\5\1\6\1\25\1\5\2\0\2\uffff";
    static final String DFA39_maxS =
        "\1\55\1\uffff\1\25\1\5\1\55\1\25\1\5\2\0\2\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\3\7\uffff\1\1\1\2";
    static final String DFA39_specialS =
        "\7\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\10\uffff\1\1\5\uffff\1\1\24\uffff\1\2\2\1",
            "",
            "\1\4\2\uffff\3\1\4\uffff\1\1\5\uffff\1\3",
            "\1\5",
            "\1\6\11\uffff\1\1\5\uffff\1\1\24\uffff\3\1",
            "\1\7",
            "\1\10",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 110:59: ( p2 '\"' ID '\"' | p2 ID '.' ID )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Ejer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_Ejer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_12_in_inicio30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ModificadorDeAcceso_in_inicio32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_inicio35 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_inicio37 = new BitSet(new long[]{0x0001C00000004010L});
    public static final BitSet FOLLOW_declaraciones_in_inicio39 = new BitSet(new long[]{0x0001C00000004010L});
    public static final BitSet FOLLOW_metodo_in_inicio41 = new BitSet(new long[]{0x0001C00000004010L});
    public static final BitSet FOLLOW_14_in_inicio44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ModificadorDeAcceso_in_metodo56 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_tipoEnt_in_metodo59 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tipoFlot_in_metodo61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tipoString_in_metodo63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_metodo66 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_metodo68 = new BitSet(new long[]{0x0001C00000010000L});
    public static final BitSet FOLLOW_argumentos_in_metodo70 = new BitSet(new long[]{0x0001C00000010000L});
    public static final BitSet FOLLOW_16_in_metodo73 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_metodo75 = new BitSet(new long[]{0x0001C00932040020L});
    public static final BitSet FOLLOW_instrucciones_in_metodo76 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_14_in_metodo78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declInt_in_argumentos90 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_declFlot_in_argumentos92 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_declString_in_argumentos94 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_argumentos98 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_declInt_in_argumentos101 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_declFlot_in_argumentos103 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_declString_in_argumentos105 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_declaraciones_in_instrucciones121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_instrucciones124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cambiar_in_instrucciones128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ciclos_in_instrucciones132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifelse_in_instrucciones136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ret_in_instrucciones140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sis_in_instrucciones144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloque_in_instrucciones148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_cambiar160 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_cambiar161 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_expr_in_cambiar163 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_cambiar164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_cambiar166 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_cambiar169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cambiar171 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cambiar173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cambiar175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_cambiar176 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cambiar177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cambiar178 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cambiar179 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_cambiar180 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_cambiar182 = new BitSet(new long[]{0x0001C00932840020L});
    public static final BitSet FOLLOW_instrucciones_in_cambiar184 = new BitSet(new long[]{0x0001C00932840020L});
    public static final BitSet FOLLOW_23_in_cambiar187 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_cambiar189 = new BitSet(new long[]{0x0000000001084000L});
    public static final BitSet FOLLOW_24_in_cambiar195 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cambiar197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cambiar199 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_cambiar200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cambiar201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cambiar202 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cambiar203 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_cambiar204 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_cambiar206 = new BitSet(new long[]{0x0001C00932848020L});
    public static final BitSet FOLLOW_instrucciones_in_cambiar209 = new BitSet(new long[]{0x0001C00932848020L});
    public static final BitSet FOLLOW_cond_in_cambiar213 = new BitSet(new long[]{0x0001C00932848020L});
    public static final BitSet FOLLOW_23_in_cambiar217 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_cambiar219 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_cambiar222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_ciclos232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while1_in_ciclos236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ifelse248 = new BitSet(new long[]{0x0001C00932048020L});
    public static final BitSet FOLLOW_cond_in_ifelse250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ifelse252 = new BitSet(new long[]{0x0001C00932042020L});
    public static final BitSet FOLLOW_cuerpo_in_ifelse255 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_instrucciones_in_ifelse257 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ifelse261 = new BitSet(new long[]{0x0001C00932042020L});
    public static final BitSet FOLLOW_cuerpo_in_ifelse264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucciones_in_ifelse266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ret280 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_atomo_in_ret282 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ret284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_sis297 = new BitSet(new long[]{0x0000000000408040L});
    public static final BitSet FOLLOW_P_in_sis300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_sis302 = new BitSet(new long[]{0x0000000000408040L});
    public static final BitSet FOLLOW_15_in_sis308 = new BitSet(new long[]{0x0000000000218720L});
    public static final BitSet FOLLOW_mExpr_in_sis312 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sis315 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_sis320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_para347 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_para349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_asignacion_in_para351 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_eRR_in_para353 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_para355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_para357 = new BitSet(new long[]{0x00000000C0000020L});
    public static final BitSet FOLLOW_30_in_para360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_31_in_para362 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_asignacion_in_para364 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_para367 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_para369 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_instrucciones_in_para372 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_14_in_para376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_while1388 = new BitSet(new long[]{0x0001C00932048020L});
    public static final BitSet FOLLOW_cond_in_while1391 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_while1394 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_instrucciones_in_while1397 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_14_in_while1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_cuerpo414 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_instrucciones_in_cuerpo415 = new BitSet(new long[]{0x0001C00932044020L});
    public static final BitSet FOLLOW_14_in_cuerpo417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_cond438 = new BitSet(new long[]{0x0001C00932048020L});
    public static final BitSet FOLLOW_e_in_cond440 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_cond442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eR_in_cond446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_in_e479 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_e482 = new BitSet(new long[]{0x0001C00932048020L});
    public static final BitSet FOLLOW_cond_in_e489 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_15_in_eR514 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_atomo_in_eR516 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_OPrelacional_in_eR518 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_atomo_in_eR520 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_eR522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomo_in_eRR536 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_OPrelacional_in_eRR538 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_atomo_in_eRR540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_bloque582 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_cuerpo_in_bloque584 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_catche_in_bloque586 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_bloque591 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_cuerpo_in_bloque593 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_catche612 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_catche614 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_exepcion_in_catche616 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_catche618 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_catche620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_cuerpo_in_catche622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_exepcion0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declInt_in_declaraciones642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declFlot_in_declaraciones646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declString_in_declaraciones650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipoEnt_in_declInt658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_declInt662 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_17_in_declInt670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_declInt675 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_22_in_declInt685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipoFlot_in_declFlot696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_declFlot700 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_17_in_declFlot708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_declFlot713 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_22_in_declFlot723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipoString_in_declString736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_declString740 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_17_in_declString748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_declString753 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_22_in_declString763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_asignacion776 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_asignacion778 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_expr_in_asignacion780 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_asignacion782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mExpr_in_expr802 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_set_in_expr807 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_mExpr_in_expr817 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_atomo_in_mExpr846 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_mExpr851 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_atomo_in_mExpr855 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_msg_in_atomo879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENT_in_atomo882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOT_in_atomo888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRI_in_atomo894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atomo900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atomo915 = new BitSet(new long[]{0x0000000000208720L});
    public static final BitSet FOLLOW_expr_in_atomo917 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atomo919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_tipoEnt972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_tipoFlot980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_tipoString987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_msg994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg995 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_msg996 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_p2_in_msg999 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_msg1001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1002 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_msg1003 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_p2_in_msg1008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1010 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_P_in_msg1012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1014 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ID_in_msg1021 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_P_in_msg1023 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1025 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_p2_in_msg1028 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_msg1030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1031 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_msg1032 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_p2_in_msg1037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_P_in_msg1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_msg1043 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_p21055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred27_Ejer261 = new BitSet(new long[]{0x0001C00932042020L});
    public static final BitSet FOLLOW_cuerpo_in_synpred27_Ejer264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucciones_in_synpred27_Ejer266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred36_Ejer438 = new BitSet(new long[]{0x0001C00932048020L});
    public static final BitSet FOLLOW_e_in_synpred36_Ejer440 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred36_Ejer442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p2_in_synpred59_Ejer999 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred59_Ejer1001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_synpred59_Ejer1002 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred59_Ejer1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p2_in_synpred60_Ejer1008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_synpred60_Ejer1010 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_P_in_synpred60_Ejer1012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_synpred60_Ejer1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p2_in_synpred62_Ejer1028 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred62_Ejer1030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_synpred62_Ejer1031 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred62_Ejer1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p2_in_synpred63_Ejer1037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_synpred63_Ejer1039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_P_in_synpred63_Ejer1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_synpred63_Ejer1043 = new BitSet(new long[]{0x0000000000000002L});

}