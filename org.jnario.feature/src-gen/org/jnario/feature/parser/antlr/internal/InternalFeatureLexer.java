package org.jnario.feature.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=23;
    public static final int RULE_ID=18;
    public static final int RULE_TEXT_AND_NL=31;
    public static final int RULE_ANY_OTHER=39;
    public static final int RULE_COMMENT_RICH_TEXT_END=25;
    public static final int EOF=-1;
    public static final int RULE_EXAMPLE_TEXT=14;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=26;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_EXAMPLE_ROW_END=15;
    public static final int RULE_SCENARIO_TEXT=9;
    public static final int RULE_RICH_TEXT_END=24;
    public static final int RULE_BACKGROUND_TEXT=8;
    public static final int RULE_MNL=30;
    public static final int RULE_DECIMAL=28;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_IN_ORDER_TEXT=5;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_I_WANT_TEXT=7;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_PIPE_SPACES=17;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=35;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=36;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=19;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_AS_A_TEXT=6;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int RULE_RICH_TEXT_START=21;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_TEXT_MULTI_LINE=33;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=20;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int RULE_THEN_TEXT=12;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int RULE_GIVEN_TEXT=10;
    public static final int RULE_WHEN_TEXT=11;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=27;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NL=32;
    public static final int RULE_SPACES=34;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=37;
    public static final int RULE_COLON=29;
    public static final int RULE_PIPE=16;
    public static final int RULE_RICH_TEXT_INBETWEEN=22;
    public static final int RULE_WS=38;
    public static final int RULE_AND_TEXT=13;
    public static final int RULE_FEATURE_TEXT=4;

    // delegates
    // delegators

    public InternalFeatureLexer() {;} 
    public InternalFeatureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g"; }

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:11:7: ( 'package' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:11:9: 'package'
            {
            match("package"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:12:7: ( ';' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:12:9: ';'
            {
            match(';'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:13:7: ( '#(' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:13:9: '#('
            {
            match("#("); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:14:7: ( ',' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:14:9: ','
            {
            match(','); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:15:7: ( ')' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:15:9: ')'
            {
            match(')'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:16:7: ( '#{' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:16:9: '#{'
            {
            match("#{"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:17:7: ( '}' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:17:9: '}'
            {
            match('}'); 

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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:18:7: ( 'should' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:18:9: 'should'
            {
            match("should"); 


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
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:19:7: ( 'must' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:19:9: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:20:7: ( 'not' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:20:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:21:7: ( 'be' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:21:9: 'be'
            {
            match("be"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:22:7: ( 'contain' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:22:9: 'contain'
            {
            match("contain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:23:7: ( '=>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:23:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:24:7: ( 'instanceof' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:24:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:25:7: ( 'assert' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:25:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:26:7: ( '#' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:26:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:27:7: ( '[' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:28:7: ( ']' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:29:7: ( 'import' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:29:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:30:7: ( 'static' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:30:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:31:7: ( 'extension' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:31:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:32:7: ( '.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:33:7: ( '*' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:33:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:34:7: ( 'public' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:34:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:35:7: ( 'class' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:35:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:36:7: ( '<' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:36:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:37:7: ( '>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:38:7: ( 'extends' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:38:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:39:7: ( 'implements' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:39:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:40:7: ( '{' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:41:7: ( '=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:41:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:42:7: ( 'def' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:42:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:43:7: ( 'override' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:43:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:44:7: ( 'dispatch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:44:9: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:45:7: ( '(' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:46:7: ( 'throws' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:46:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:47:7: ( 'new' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:47:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:48:7: ( 'create' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:48:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:49:7: ( ':' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:49:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:50:7: ( '...' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:50:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:51:7: ( 'FOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:51:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:52:7: ( 'BEFORE' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:52:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:53:7: ( 'SEPARATOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:53:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:54:7: ( 'AFTER' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:54:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:55:7: ( 'ENDFOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:55:9: 'ENDFOR'
            {
            match("ENDFOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:56:7: ( 'IF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:56:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:57:7: ( 'ELSE' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:57:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:58:7: ( 'ENDIF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:58:9: 'ENDIF'
            {
            match("ENDIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:59:7: ( 'ELSEIF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:59:9: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:60:7: ( '@' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:60:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:61:7: ( '+' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:61:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:62:7: ( '+=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:62:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:63:7: ( '||' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:63:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:64:7: ( '&&' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:64:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:65:7: ( '==' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:65:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:66:7: ( '!=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:66:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:67:7: ( '>=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:67:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:68:7: ( '<=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:68:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:69:7: ( '->' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:69:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:70:7: ( '..' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:70:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:71:8: ( '-' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:71:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:72:8: ( '**' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:72:10: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:73:8: ( '/' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:73:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:74:8: ( '%' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:74:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:75:8: ( '!' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:75:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:76:8: ( 'as' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:76:10: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:77:8: ( '?.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:77:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:78:8: ( '*.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:78:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:79:8: ( 'if' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:79:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:80:8: ( 'else' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:80:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:81:8: ( 'switch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:81:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:82:8: ( 'default' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:82:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:83:8: ( 'case' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:83:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:84:8: ( 'for' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:84:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:85:8: ( 'while' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:85:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:86:8: ( 'do' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:86:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:87:8: ( 'var' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:87:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:88:8: ( 'val' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:88:10: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:89:8: ( 'super' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:89:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:90:8: ( '::' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:90:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:91:8: ( 'false' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:91:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:92:8: ( 'true' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:92:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:93:8: ( 'null' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:93:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:94:8: ( 'typeof' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:94:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:95:8: ( 'throw' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:95:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:96:8: ( 'return' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:96:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:97:8: ( 'try' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:97:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:98:8: ( 'finally' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:98:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:99:8: ( 'catch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:99:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:100:8: ( '?' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:100:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:101:8: ( '&' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:101:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:102:8: ( 'protected' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:102:10: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:103:8: ( 'private' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:103:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9611:19: ( 'Feature' RULE_COLON RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9611:21: 'Feature' RULE_COLON RULE_MNL
            {
            match("Feature"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9613:22: ( 'Background' RULE_COLON RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9613:24: 'Background' RULE_COLON RULE_MNL
            {
            match("Background"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKGROUND_TEXT"

    // $ANTLR start "RULE_SCENARIO_TEXT"
    public final void mRULE_SCENARIO_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9615:20: ( 'Scenario' RULE_COLON RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9615:22: 'Scenario' RULE_COLON RULE_MNL
            {
            match("Scenario"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9617:17: ( 'Given ' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9617:19: 'Given ' RULE_MNL
            {
            match("Given "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVEN_TEXT"

    // $ANTLR start "RULE_WHEN_TEXT"
    public final void mRULE_WHEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_WHEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9619:16: ( 'When ' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9619:18: 'When ' RULE_MNL
            {
            match("When "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN_TEXT"

    // $ANTLR start "RULE_THEN_TEXT"
    public final void mRULE_THEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_THEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9621:16: ( 'Then ' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9621:18: 'Then ' RULE_MNL
            {
            match("Then "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_TEXT"

    // $ANTLR start "RULE_AND_TEXT"
    public final void mRULE_AND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_AND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9623:15: ( 'And ' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9623:17: 'And ' RULE_MNL
            {
            match("And "); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_EXAMPLE_TEXT"
    public final void mRULE_EXAMPLE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9625:19: ( 'Examples' RULE_COLON RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9625:21: 'Examples' RULE_COLON RULE_MNL
            {
            match("Examples"); 

            mRULE_COLON(); 
            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_TEXT"

    // $ANTLR start "RULE_IN_ORDER_TEXT"
    public final void mRULE_IN_ORDER_TEXT() throws RecognitionException {
        try {
            int _type = RULE_IN_ORDER_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9627:20: ( 'In order to' RULE_TEXT_AND_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9627:22: 'In order to' RULE_TEXT_AND_NL
            {
            match("In order to"); 

            mRULE_TEXT_AND_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_ORDER_TEXT"

    // $ANTLR start "RULE_AS_A_TEXT"
    public final void mRULE_AS_A_TEXT() throws RecognitionException {
        try {
            int _type = RULE_AS_A_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9629:16: ( 'As a' RULE_TEXT_AND_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9629:18: 'As a' RULE_TEXT_AND_NL
            {
            match("As a"); 

            mRULE_TEXT_AND_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AS_A_TEXT"

    // $ANTLR start "RULE_I_WANT_TEXT"
    public final void mRULE_I_WANT_TEXT() throws RecognitionException {
        try {
            int _type = RULE_I_WANT_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9631:18: ( 'I want' RULE_TEXT_AND_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9631:20: 'I want' RULE_TEXT_AND_NL
            {
            match("I want"); 

            mRULE_TEXT_AND_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_I_WANT_TEXT"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9633:11: ( '|' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9633:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_PIPE_SPACES"
    public final void mRULE_PIPE_SPACES() throws RecognitionException {
        try {
            int _type = RULE_PIPE_SPACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9635:18: ( RULE_PIPE ( ' ' | '\\t' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9635:20: RULE_PIPE ( ' ' | '\\t' )+
            {
            mRULE_PIPE(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9635:30: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE_SPACES"

    // $ANTLR start "RULE_EXAMPLE_ROW_END"
    public final void mRULE_EXAMPLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:22: ( ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:24: ( RULE_PIPE | RULE_PIPE_SPACES ) ( '\\r' )? '\\n'
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:24: ( RULE_PIPE | RULE_PIPE_SPACES )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='|') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n'||LA2_1=='\r') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='\t'||LA2_1==' ') ) {
                    alt2=2;
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
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:25: RULE_PIPE
                    {
                    mRULE_PIPE(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:35: RULE_PIPE_SPACES
                    {
                    mRULE_PIPE_SPACES(); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:53: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9637:53: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_ROW_END"

    // $ANTLR start "RULE_TEXT_MULTI_LINE"
    public final void mRULE_TEXT_MULTI_LINE() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9639:31: ( (~ ( ( '\\r' | '\\n' ) ) )* '\\\\' RULE_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9639:33: (~ ( ( '\\r' | '\\n' ) ) )* '\\\\' RULE_NL
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9639:33: (~ ( ( '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>='\u0000' && LA4_1<='\t')||(LA4_1>='\u000B' && LA4_1<='\f')||(LA4_1>='\u000E' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9639:33: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\\'); 
            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_MULTI_LINE"

    // $ANTLR start "RULE_TEXT_AND_NL"
    public final void mRULE_TEXT_AND_NL() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9641:27: ( (~ ( ( '\\r' | '\\n' | '\\\\' ) ) )* RULE_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9641:29: (~ ( ( '\\r' | '\\n' | '\\\\' ) ) )* RULE_NL
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9641:29: (~ ( ( '\\r' | '\\n' | '\\\\' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9641:29: ~ ( ( '\\r' | '\\n' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_AND_NL"

    // $ANTLR start "RULE_MNL"
    public final void mRULE_MNL() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9643:19: ( ( RULE_TEXT_MULTI_LINE )* RULE_TEXT_AND_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9643:21: ( RULE_TEXT_MULTI_LINE )* RULE_TEXT_AND_NL
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9643:21: ( RULE_TEXT_MULTI_LINE )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9643:21: RULE_TEXT_MULTI_LINE
            	    {
            	    mRULE_TEXT_MULTI_LINE(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mRULE_TEXT_AND_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MNL"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9645:21: ( RULE_SPACES ':' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9645:23: RULE_SPACES ':'
            {
            mRULE_SPACES(); 
            match(':'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9647:18: ( ( '\\r' )? ( '\\n' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9647:20: ( '\\r' )? ( '\\n' )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9647:20: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9647:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9647:26: ( '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9647:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SPACES"
    public final void mRULE_SPACES() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9649:22: ( ( ' ' | '\\t' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9649:24: ( ' ' | '\\t' )*
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9649:24: ( ' ' | '\\t' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACES"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:27: ( RULE_IN_RICH_STRING )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='\'') ) {
                        int LA10_4 = input.LA(3);

                        if ( ((LA10_4>='\u0000' && LA10_4<='&')||(LA10_4>='(' && LA10_4<='\u00AA')||(LA10_4>='\u00AC' && LA10_4<='\uFFFF')) ) {
                            alt10=1;
                        }


                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='&')||(LA10_1>='(' && LA10_1<='\u00AA')||(LA10_1>='\u00AC' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='\u00AA')||(LA10_0>='\u00AC' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\'') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='\'') ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='\'') ) {
                        alt13=1;
                    }
                    else {
                        alt13=2;}
                }
                else {
                    alt13=2;}
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:58: ( '\\'' ( '\\'' )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\'') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:64: ( '\\'' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='\'') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9651:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:33: ( RULE_IN_RICH_STRING )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\'') ) {
                        int LA14_4 = input.LA(3);

                        if ( ((LA14_4>='\u0000' && LA14_4<='&')||(LA14_4>='(' && LA14_4<='\u00AA')||(LA14_4>='\u00AC' && LA14_4<='\uFFFF')) ) {
                            alt14=1;
                        }


                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='&')||(LA14_1>='(' && LA14_1<='\u00AA')||(LA14_1>='\u00AC' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:54: ( '\\'' ( '\\'' )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\'') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:60: ( '\\'' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\'') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9653:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:31: ( RULE_IN_RICH_STRING )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\'') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='\'') ) {
                        int LA17_4 = input.LA(3);

                        if ( ((LA17_4>='\u0000' && LA17_4<='&')||(LA17_4>='(' && LA17_4<='\u00AA')||(LA17_4>='\u00AC' && LA17_4<='\uFFFF')) ) {
                            alt17=1;
                        }


                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\u00AA')||(LA17_1>='\u00AC' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\u00AA')||(LA17_0>='\u00AC' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\'') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='\'') ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3=='\'') ) {
                        alt20=1;
                    }
                    else {
                        alt20=2;}
                }
                else {
                    alt20=2;}
            }
            else {
                alt20=2;}
            switch (alt20) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:62: ( '\\'' ( '\\'' )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:68: ( '\\'' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='\'') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9655:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:37: ( RULE_IN_RICH_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\'') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\'') ) {
                        int LA21_4 = input.LA(3);

                        if ( ((LA21_4>='\u0000' && LA21_4<='&')||(LA21_4>='(' && LA21_4<='\u00AA')||(LA21_4>='\u00AC' && LA21_4<='\uFFFF')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='&')||(LA21_1>='(' && LA21_1<='\u00AA')||(LA21_1>='\u00AC' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\u00AA')||(LA21_0>='\u00AC' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:58: ( '\\'' ( '\\'' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\'') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:64: ( '\\'' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\'') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9657:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:51: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:68: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:79: ( RULE_IN_RICH_STRING )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\'') ) {
                            int LA26_1 = input.LA(2);

                            if ( (LA26_1=='\'') ) {
                                int LA26_4 = input.LA(3);

                                if ( ((LA26_4>='\u0000' && LA26_4<='&')||(LA26_4>='(' && LA26_4<='\u00AA')||(LA26_4>='\u00AC' && LA26_4<='\uFFFF')) ) {
                                    alt26=1;
                                }


                            }
                            else if ( ((LA26_1>='\u0000' && LA26_1<='&')||(LA26_1>='(' && LA26_1<='\u00AA')||(LA26_1>='\u00AC' && LA26_1<='\uFFFF')) ) {
                                alt26=1;
                            }


                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='\u00AA')||(LA26_0>='\u00AC' && LA26_0<='\uFFFF')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:100: ( '\\'' ( '\\'' )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\'') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:106: ( '\\'' )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0=='\'') ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9659:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
            }
            else {
                alt36=2;}
            switch (alt36) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:62: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:73: ( RULE_IN_RICH_STRING )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='\'') ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1=='\'') ) {
                                int LA32_4 = input.LA(3);

                                if ( ((LA32_4>='\u0000' && LA32_4<='&')||(LA32_4>='(' && LA32_4<='\u00AA')||(LA32_4>='\u00AC' && LA32_4<='\uFFFF')) ) {
                                    alt32=1;
                                }


                            }
                            else if ( ((LA32_1>='\u0000' && LA32_1<='&')||(LA32_1>='(' && LA32_1<='\u00AA')||(LA32_1>='\u00AC' && LA32_1<='\uFFFF')) ) {
                                alt32=1;
                            }


                        }
                        else if ( ((LA32_0>='\u0000' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='\u00AA')||(LA32_0>='\u00AC' && LA32_0<='\uFFFF')) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\'') ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1=='\'') ) {
                            int LA35_3 = input.LA(3);

                            if ( (LA35_3=='\'') ) {
                                alt35=1;
                            }
                            else {
                                alt35=2;}
                        }
                        else {
                            alt35=2;}
                    }
                    else {
                        alt35=2;}
                    switch (alt35) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:104: ( '\\'' ( '\\'' )? )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0=='\'') ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:110: ( '\\'' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0=='\'') ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9661:123: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9663:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9663:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9663:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\'') ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1=='\'') ) {
                    alt37=1;
                }
                else if ( ((LA37_1>='\u0000' && LA37_1<='&')||(LA37_1>='(' && LA37_1<='\u00AA')||(LA37_1>='\u00AC' && LA37_1<='\uFFFF')) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA37_0>='\u0000' && LA37_0<='&')||(LA37_0>='(' && LA37_0<='\u00AA')||(LA37_0>='\u00AC' && LA37_0<='\uFFFF')) ) {
                alt37=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9663:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9663:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9663:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:12: ( '0x' | '0X' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='0') ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1=='x') ) {
                    alt38=1;
                }
                else if ( (LA38_1=='X') ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='0' && LA39_0<='9')||(LA39_0>='A' && LA39_0<='F')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='f')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='#') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='B'||LA40_0=='b') ) {
                        alt40=1;
                    }
                    else if ( (LA40_0=='L'||LA40_0=='l') ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9665:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9667:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9667:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9667:21: ( '0' .. '9' | '_' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='0' && LA42_0<='9')||LA42_0=='_') ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='E'||LA44_0=='e') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:36: ( '+' | '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0=='+'||LA43_0=='-') ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='B'||LA45_0=='b') ) {
                alt45=1;
            }
            else if ( (LA45_0=='D'||LA45_0=='F'||LA45_0=='L'||LA45_0=='d'||LA45_0=='f'||LA45_0=='l') ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9669:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9671:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9671:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9671:11: ( '^' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='^') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9671:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9671:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0=='$'||(LA47_0>='0' && LA47_0<='9')||(LA47_0>='A' && LA47_0<='Z')||LA47_0=='_'||(LA47_0>='a' && LA47_0<='z')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='\"') ) {
                alt50=1;
            }
            else if ( (LA50_0=='\'') ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop48:
                    do {
                        int alt48=3;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0=='\\') ) {
                            alt48=1;
                        }
                        else if ( ((LA48_0>='\u0000' && LA48_0<='!')||(LA48_0>='#' && LA48_0<='[')||(LA48_0>=']' && LA48_0<='\uFFFF')) ) {
                            alt48=2;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop49:
                    do {
                        int alt49=3;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0=='\\') ) {
                            alt49=1;
                        }
                        else if ( ((LA49_0>='\u0000' && LA49_0<='&')||(LA49_0>='(' && LA49_0<='[')||(LA49_0>=']' && LA49_0<='\uFFFF')) ) {
                            alt49=2;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9673:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9675:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9675:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9675:24: ( options {greedy=false; } : . )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0=='*') ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1=='/') ) {
                        alt51=2;
                    }
                    else if ( ((LA51_1>='\u0000' && LA51_1<='.')||(LA51_1>='0' && LA51_1<='\uFFFF')) ) {
                        alt51=1;
                    }


                }
                else if ( ((LA51_0>='\u0000' && LA51_0<=')')||(LA51_0>='+' && LA51_0<='\uFFFF')) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9675:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>='\u0000' && LA52_0<='\t')||(LA52_0>='\u000B' && LA52_0<='\f')||(LA52_0>='\u000E' && LA52_0<='\uFFFF')) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:40: ( ( '\\r' )? '\\n' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0=='\n'||LA54_0=='\r') ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:41: ( '\\r' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0=='\r') ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9677:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9679:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>='\t' && LA55_0<='\n')||LA55_0=='\r'||LA55_0==' ') ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
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
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9681:16: ( . )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:9681:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:8: ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | RULE_FEATURE_TEXT | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_IN_ORDER_TEXT | RULE_AS_A_TEXT | RULE_I_WANT_TEXT | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt56=122;
        alt56 = dfa56.predict(input);
        switch (alt56) {
            case 1 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:10: T__40
                {
                mT__40(); 

                }
                break;
            case 2 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:16: T__41
                {
                mT__41(); 

                }
                break;
            case 3 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:22: T__42
                {
                mT__42(); 

                }
                break;
            case 4 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:28: T__43
                {
                mT__43(); 

                }
                break;
            case 5 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:34: T__44
                {
                mT__44(); 

                }
                break;
            case 6 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:40: T__45
                {
                mT__45(); 

                }
                break;
            case 7 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:46: T__46
                {
                mT__46(); 

                }
                break;
            case 8 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:52: T__47
                {
                mT__47(); 

                }
                break;
            case 9 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:58: T__48
                {
                mT__48(); 

                }
                break;
            case 10 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:64: T__49
                {
                mT__49(); 

                }
                break;
            case 11 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:70: T__50
                {
                mT__50(); 

                }
                break;
            case 12 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:76: T__51
                {
                mT__51(); 

                }
                break;
            case 13 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:82: T__52
                {
                mT__52(); 

                }
                break;
            case 14 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:88: T__53
                {
                mT__53(); 

                }
                break;
            case 15 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:94: T__54
                {
                mT__54(); 

                }
                break;
            case 16 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:100: T__55
                {
                mT__55(); 

                }
                break;
            case 17 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:106: T__56
                {
                mT__56(); 

                }
                break;
            case 18 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:112: T__57
                {
                mT__57(); 

                }
                break;
            case 19 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:118: T__58
                {
                mT__58(); 

                }
                break;
            case 20 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:124: T__59
                {
                mT__59(); 

                }
                break;
            case 21 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:130: T__60
                {
                mT__60(); 

                }
                break;
            case 22 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:136: T__61
                {
                mT__61(); 

                }
                break;
            case 23 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:142: T__62
                {
                mT__62(); 

                }
                break;
            case 24 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:148: T__63
                {
                mT__63(); 

                }
                break;
            case 25 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:154: T__64
                {
                mT__64(); 

                }
                break;
            case 26 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:160: T__65
                {
                mT__65(); 

                }
                break;
            case 27 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:166: T__66
                {
                mT__66(); 

                }
                break;
            case 28 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:172: T__67
                {
                mT__67(); 

                }
                break;
            case 29 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:178: T__68
                {
                mT__68(); 

                }
                break;
            case 30 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:184: T__69
                {
                mT__69(); 

                }
                break;
            case 31 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:190: T__70
                {
                mT__70(); 

                }
                break;
            case 32 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:196: T__71
                {
                mT__71(); 

                }
                break;
            case 33 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:202: T__72
                {
                mT__72(); 

                }
                break;
            case 34 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:208: T__73
                {
                mT__73(); 

                }
                break;
            case 35 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:214: T__74
                {
                mT__74(); 

                }
                break;
            case 36 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:220: T__75
                {
                mT__75(); 

                }
                break;
            case 37 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:226: T__76
                {
                mT__76(); 

                }
                break;
            case 38 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:232: T__77
                {
                mT__77(); 

                }
                break;
            case 39 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:238: T__78
                {
                mT__78(); 

                }
                break;
            case 40 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:244: T__79
                {
                mT__79(); 

                }
                break;
            case 41 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:250: T__80
                {
                mT__80(); 

                }
                break;
            case 42 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:256: T__81
                {
                mT__81(); 

                }
                break;
            case 43 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:262: T__82
                {
                mT__82(); 

                }
                break;
            case 44 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:268: T__83
                {
                mT__83(); 

                }
                break;
            case 45 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:274: T__84
                {
                mT__84(); 

                }
                break;
            case 46 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:280: T__85
                {
                mT__85(); 

                }
                break;
            case 47 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:286: T__86
                {
                mT__86(); 

                }
                break;
            case 48 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:292: T__87
                {
                mT__87(); 

                }
                break;
            case 49 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:298: T__88
                {
                mT__88(); 

                }
                break;
            case 50 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:304: T__89
                {
                mT__89(); 

                }
                break;
            case 51 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:310: T__90
                {
                mT__90(); 

                }
                break;
            case 52 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:316: T__91
                {
                mT__91(); 

                }
                break;
            case 53 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:322: T__92
                {
                mT__92(); 

                }
                break;
            case 54 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:328: T__93
                {
                mT__93(); 

                }
                break;
            case 55 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:334: T__94
                {
                mT__94(); 

                }
                break;
            case 56 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:340: T__95
                {
                mT__95(); 

                }
                break;
            case 57 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:346: T__96
                {
                mT__96(); 

                }
                break;
            case 58 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:352: T__97
                {
                mT__97(); 

                }
                break;
            case 59 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:358: T__98
                {
                mT__98(); 

                }
                break;
            case 60 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:364: T__99
                {
                mT__99(); 

                }
                break;
            case 61 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:370: T__100
                {
                mT__100(); 

                }
                break;
            case 62 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:377: T__101
                {
                mT__101(); 

                }
                break;
            case 63 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:384: T__102
                {
                mT__102(); 

                }
                break;
            case 64 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:391: T__103
                {
                mT__103(); 

                }
                break;
            case 65 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:398: T__104
                {
                mT__104(); 

                }
                break;
            case 66 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:405: T__105
                {
                mT__105(); 

                }
                break;
            case 67 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:412: T__106
                {
                mT__106(); 

                }
                break;
            case 68 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:419: T__107
                {
                mT__107(); 

                }
                break;
            case 69 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:426: T__108
                {
                mT__108(); 

                }
                break;
            case 70 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:433: T__109
                {
                mT__109(); 

                }
                break;
            case 71 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:440: T__110
                {
                mT__110(); 

                }
                break;
            case 72 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:447: T__111
                {
                mT__111(); 

                }
                break;
            case 73 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:454: T__112
                {
                mT__112(); 

                }
                break;
            case 74 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:461: T__113
                {
                mT__113(); 

                }
                break;
            case 75 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:468: T__114
                {
                mT__114(); 

                }
                break;
            case 76 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:475: T__115
                {
                mT__115(); 

                }
                break;
            case 77 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:482: T__116
                {
                mT__116(); 

                }
                break;
            case 78 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:489: T__117
                {
                mT__117(); 

                }
                break;
            case 79 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:496: T__118
                {
                mT__118(); 

                }
                break;
            case 80 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:503: T__119
                {
                mT__119(); 

                }
                break;
            case 81 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:510: T__120
                {
                mT__120(); 

                }
                break;
            case 82 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:517: T__121
                {
                mT__121(); 

                }
                break;
            case 83 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:524: T__122
                {
                mT__122(); 

                }
                break;
            case 84 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:531: T__123
                {
                mT__123(); 

                }
                break;
            case 85 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:538: T__124
                {
                mT__124(); 

                }
                break;
            case 86 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:545: T__125
                {
                mT__125(); 

                }
                break;
            case 87 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:552: T__126
                {
                mT__126(); 

                }
                break;
            case 88 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:559: T__127
                {
                mT__127(); 

                }
                break;
            case 89 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:566: T__128
                {
                mT__128(); 

                }
                break;
            case 90 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:573: T__129
                {
                mT__129(); 

                }
                break;
            case 91 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:580: T__130
                {
                mT__130(); 

                }
                break;
            case 92 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:587: T__131
                {
                mT__131(); 

                }
                break;
            case 93 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:594: T__132
                {
                mT__132(); 

                }
                break;
            case 94 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:601: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 95 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:619: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 96 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:640: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 97 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:659: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 98 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:675: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 99 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:690: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 100 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:705: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 101 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:719: RULE_EXAMPLE_TEXT
                {
                mRULE_EXAMPLE_TEXT(); 

                }
                break;
            case 102 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:737: RULE_IN_ORDER_TEXT
                {
                mRULE_IN_ORDER_TEXT(); 

                }
                break;
            case 103 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:756: RULE_AS_A_TEXT
                {
                mRULE_AS_A_TEXT(); 

                }
                break;
            case 104 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:771: RULE_I_WANT_TEXT
                {
                mRULE_I_WANT_TEXT(); 

                }
                break;
            case 105 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:788: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 106 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:798: RULE_PIPE_SPACES
                {
                mRULE_PIPE_SPACES(); 

                }
                break;
            case 107 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:815: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 108 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:836: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 109 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:851: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 110 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:872: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 111 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:891: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 112 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:916: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 113 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:949: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 114 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:976: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 115 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:985: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 116 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:994: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 117 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1007: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 118 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1015: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 119 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1027: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 120 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1043: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 121 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1059: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 122 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:1067: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA6_eotS =
        "\2\2\2\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\0\2\uffff";
    static final String DFA6_maxS =
        "\2\uffff\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\1\0\1\1\2\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1\1\uffff\2\1\1\uffff\116\1\1\3\uffa3\1",
            "\12\1\1\uffff\2\1\1\uffff\116\1\1\3\uffa3\1",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 9643:21: ( RULE_TEXT_MULTI_LINE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {s = 1;}

                        else if ( (LA6_0=='\\') ) {s = 3;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_1 = input.LA(1);

                        s = -1;
                        if ( (LA6_1=='\\') ) {s = 3;}

                        else if ( ((LA6_1>='\u0000' && LA6_1<='\t')||(LA6_1>='\u000B' && LA6_1<='\f')||(LA6_1>='\u000E' && LA6_1<='[')||(LA6_1>=']' && LA6_1<='\uFFFF')) ) {s = 1;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\1\uffff\1\77\1\uffff\1\103\3\uffff\5\77\1\126\2\77\2\uffff\1\77"+
        "\1\140\1\143\1\145\1\147\1\uffff\2\77\1\uffff\1\77\1\162\6\77\1"+
        "\uffff\1\u0084\1\u0086\1\u008a\1\u008c\1\u008e\1\u0091\1\uffff\1"+
        "\u0094\7\77\1\73\1\u00a3\1\73\2\u00a7\1\73\1\uffff\1\73\2\uffff"+
        "\3\77\10\uffff\10\77\1\u00b6\4\77\3\uffff\2\77\1\u00be\1\u00c0\2"+
        "\uffff\2\77\1\u00c4\11\uffff\2\77\1\u00c7\1\77\1\uffff\3\77\2\uffff"+
        "\14\77\1\u00d9\1\77\6\uffff\1\u00db\15\uffff\11\77\1\u009f\1\uffff"+
        "\2\u00a3\2\uffff\1\u00ec\1\uffff\1\u00a7\3\uffff\11\77\1\u00f6\1"+
        "\u00f7\1\77\1\uffff\7\77\1\uffff\1\77\1\uffff\2\77\2\uffff\1\u0105"+
        "\1\77\1\uffff\3\77\1\u010a\1\77\1\u010c\7\77\1\uffff\3\77\3\uffff"+
        "\1\u0118\3\77\1\u011c\1\u011d\4\77\1\u0125\2\u00a3\1\u00ec\1\uffff"+
        "\1\u0129\1\uffff\10\77\1\u0132\2\uffff\1\u0133\3\77\1\u0137\6\77"+
        "\1\u013e\1\77\1\uffff\3\77\1\u0143\1\uffff\1\77\1\uffff\6\77\1\uffff"+
        "\2\77\1\u014e\1\77\1\uffff\3\77\2\uffff\4\77\2\u0125\2\uffff\1\u00a3"+
        "\2\u0129\1\uffff\7\77\1\u0162\2\uffff\1\77\1\u0164\1\77\1\uffff"+
        "\1\u0166\5\77\1\uffff\3\77\1\u0171\1\uffff\6\77\1\u0178\1\77\1\u017a"+
        "\1\77\1\uffff\1\77\1\u017d\1\77\1\u017f\2\77\2\uffff\2\u0125\2\u0129"+
        "\1\77\1\u0185\2\77\1\u0188\1\u0189\1\u018a\1\uffff\1\77\1\uffff"+
        "\1\u018c\1\uffff\1\77\1\u018e\1\77\1\u0190\5\77\1\u0196\1\uffff"+
        "\1\u0197\1\77\1\u0199\3\77\1\uffff\1\u019d\1\uffff\1\u019e\1\77"+
        "\1\uffff\1\77\1\uffff\1\u01a1\1\uffff\1\u0125\1\u0129\1\u01a2\1"+
        "\uffff\1\77\1\u01a4\3\uffff\1\u01a5\1\uffff\1\77\1\uffff\1\77\1"+
        "\uffff\1\77\1\u01a9\1\u01aa\2\77\2\uffff\1\77\1\uffff\3\77\2\uffff"+
        "\1\77\1\u01b2\2\uffff\1\77\2\uffff\3\77\2\uffff\1\u01b7\1\u01b8"+
        "\1\uffff\4\77\1\uffff\1\u01bd\2\77\1\u01c0\2\uffff\1\77\1\u01c2"+
        "\3\uffff\1\u01c3\1\u01c4\1\uffff\1\77\4\uffff";
    static final String DFA56_eofS =
        "\u01c6\uffff";
    static final String DFA56_minS =
        "\1\0\1\141\1\uffff\1\50\3\uffff\1\150\1\165\2\145\1\141\1\75\1"+
        "\146\1\163\2\uffff\1\154\1\56\1\52\2\75\1\uffff\1\145\1\166\1\uffff"+
        "\1\150\1\72\1\117\2\105\1\106\1\114\1\40\1\uffff\1\75\1\11\1\46"+
        "\1\75\1\76\1\52\1\uffff\1\56\1\141\1\150\1\141\1\145\1\151\2\150"+
        "\2\0\1\u00ab\2\60\1\44\1\uffff\1\0\2\uffff\1\143\1\142\1\151\10"+
        "\uffff\1\157\1\141\1\151\1\160\1\163\1\164\1\167\1\154\1\44\1\156"+
        "\1\141\1\145\1\163\3\uffff\1\163\1\160\2\44\2\uffff\1\164\1\163"+
        "\1\56\11\uffff\1\146\1\163\1\44\1\145\1\uffff\1\162\1\165\1\160"+
        "\2\uffff\1\122\1\141\1\106\1\143\1\120\1\145\1\124\1\144\1\40\1"+
        "\104\1\123\1\141\1\44\1\40\6\uffff\1\11\15\uffff\1\162\1\154\1\156"+
        "\1\151\1\154\1\164\1\166\2\145\1\47\1\uffff\2\0\2\uffff\1\0\1\uffff"+
        "\1\60\3\uffff\1\153\1\154\1\164\1\166\1\165\2\164\1\145\1\164\2"+
        "\44\1\154\1\uffff\1\164\1\163\1\141\1\145\1\143\1\164\1\154\1\uffff"+
        "\1\145\1\uffff\2\145\2\uffff\1\44\1\160\1\uffff\1\162\1\157\1\145"+
        "\1\44\1\145\1\44\1\164\1\117\1\153\1\101\1\156\1\105\1\40\1\uffff"+
        "\1\106\1\105\1\155\3\uffff\1\44\1\163\1\141\1\154\2\44\1\165\1\145"+
        "\2\156\4\0\1\12\1\0\1\uffff\1\141\1\151\1\145\1\141\1\154\1\151"+
        "\1\143\1\162\1\44\2\uffff\1\44\1\141\1\163\1\164\1\44\1\150\1\141"+
        "\1\162\1\145\1\162\1\156\1\44\1\165\1\uffff\1\141\1\162\1\167\1"+
        "\44\1\uffff\1\157\1\uffff\1\165\1\122\1\147\1\122\1\141\1\122\1"+
        "\uffff\1\117\1\106\1\44\1\160\1\uffff\1\145\1\154\1\145\2\uffff"+
        "\1\162\1\156\2\40\2\0\2\uffff\3\0\1\uffff\1\147\2\143\1\164\1\144"+
        "\1\143\1\150\1\44\2\uffff\1\151\1\44\1\145\1\uffff\1\44\1\156\1"+
        "\164\1\155\1\164\1\144\1\uffff\1\154\1\164\1\151\1\44\1\uffff\1"+
        "\146\1\162\1\105\1\162\1\101\1\162\1\44\1\122\1\44\1\106\1\uffff"+
        "\1\154\1\44\1\154\1\44\1\156\1\40\2\uffff\4\0\1\145\1\44\1\164\1"+
        "\145\3\44\1\uffff\1\156\1\uffff\1\44\1\uffff\1\143\1\44\1\145\1"+
        "\44\1\151\1\163\1\164\1\143\1\144\1\44\1\uffff\1\44\1\145\1\44\1"+
        "\157\1\124\1\151\1\uffff\1\44\1\uffff\1\44\1\145\1\uffff\1\171\1"+
        "\uffff\1\44\1\uffff\2\0\1\44\1\uffff\1\145\1\44\3\uffff\1\44\1\uffff"+
        "\1\145\1\uffff\1\156\1\uffff\1\157\2\44\1\150\1\145\2\uffff\1\11"+
        "\1\uffff\1\165\1\117\1\157\2\uffff\1\163\1\44\2\uffff\1\144\2\uffff"+
        "\1\157\1\164\1\156\2\uffff\2\44\1\uffff\1\156\1\122\2\11\1\uffff"+
        "\1\44\1\146\1\163\1\44\2\uffff\1\144\1\44\3\uffff\2\44\1\uffff\1"+
        "\11\4\uffff";
    static final String DFA56_maxS =
        "\1\uffff\1\165\1\uffff\1\173\3\uffff\1\167\2\165\1\145\1\162\1"+
        "\76\1\156\1\163\2\uffff\1\170\2\56\2\75\1\uffff\1\157\1\166\1\uffff"+
        "\1\171\1\72\1\145\1\141\1\143\1\163\1\170\1\156\1\uffff\1\75\1\174"+
        "\1\46\1\75\1\76\1\57\1\uffff\1\56\1\157\1\150\1\141\1\145\1\151"+
        "\2\150\2\uffff\1\u00ab\1\170\1\154\1\172\1\uffff\1\uffff\2\uffff"+
        "\1\143\1\142\1\157\10\uffff\1\157\1\141\1\151\1\160\1\163\1\164"+
        "\1\167\1\154\1\172\1\156\1\141\1\145\1\164\3\uffff\1\163\1\160\2"+
        "\172\2\uffff\1\164\1\163\1\56\11\uffff\1\146\1\163\1\172\1\145\1"+
        "\uffff\1\162\1\171\1\160\2\uffff\1\122\1\141\1\106\1\143\1\120\1"+
        "\145\1\124\1\144\1\40\1\104\1\123\1\141\1\172\1\40\6\uffff\1\40"+
        "\15\uffff\1\162\1\154\1\156\1\151\1\162\1\164\1\166\2\145\1\47\1"+
        "\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\154\3\uffff\1\153\1\154"+
        "\1\164\1\166\1\165\2\164\1\145\1\164\2\172\1\154\1\uffff\1\164\1"+
        "\163\1\141\1\145\1\143\1\164\1\157\1\uffff\1\145\1\uffff\2\145\2"+
        "\uffff\1\172\1\160\1\uffff\1\162\1\157\1\145\1\172\1\145\1\172\1"+
        "\164\1\117\1\153\1\101\1\156\1\105\1\40\1\uffff\1\111\1\105\1\155"+
        "\3\uffff\1\172\1\163\1\141\1\154\2\172\1\165\1\145\2\156\4\uffff"+
        "\1\12\1\uffff\1\uffff\1\141\1\151\1\145\1\141\1\154\1\151\1\143"+
        "\1\162\1\172\2\uffff\1\172\1\141\1\163\1\164\1\172\1\150\1\141\1"+
        "\162\1\145\1\162\1\156\1\172\1\165\1\uffff\1\141\1\162\1\167\1\172"+
        "\1\uffff\1\157\1\uffff\1\165\1\122\1\147\1\122\1\141\1\122\1\uffff"+
        "\1\117\1\106\1\172\1\160\1\uffff\1\145\1\154\1\145\2\uffff\1\162"+
        "\1\156\2\40\2\uffff\2\uffff\3\uffff\1\uffff\1\147\2\143\1\164\1"+
        "\144\1\143\1\150\1\172\2\uffff\1\151\1\172\1\145\1\uffff\1\172\1"+
        "\156\1\164\1\155\1\164\1\163\1\uffff\1\154\1\164\1\151\1\172\1\uffff"+
        "\1\146\1\162\1\105\1\162\1\101\1\162\1\172\1\122\1\172\1\106\1\uffff"+
        "\1\154\1\172\1\154\1\172\1\156\1\40\2\uffff\4\uffff\1\145\1\172"+
        "\1\164\1\145\3\172\1\uffff\1\156\1\uffff\1\172\1\uffff\1\143\1\172"+
        "\1\145\1\172\1\151\1\163\1\164\1\143\1\144\1\172\1\uffff\1\172\1"+
        "\145\1\172\1\157\1\124\1\151\1\uffff\1\172\1\uffff\1\172\1\145\1"+
        "\uffff\1\171\1\uffff\1\172\1\uffff\2\uffff\1\172\1\uffff\1\145\1"+
        "\172\3\uffff\1\172\1\uffff\1\145\1\uffff\1\156\1\uffff\1\157\2\172"+
        "\1\150\1\145\2\uffff\1\72\1\uffff\1\165\1\117\1\157\2\uffff\1\163"+
        "\1\172\2\uffff\1\144\2\uffff\1\157\1\164\1\156\2\uffff\2\172\1\uffff"+
        "\1\156\1\122\2\72\1\uffff\1\172\1\146\1\163\1\172\2\uffff\1\144"+
        "\1\172\3\uffff\2\172\1\uffff\1\72\4\uffff";
    static final String DFA56_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\7\10\uffff\1\21\1\22\5\uffff\1\36"+
        "\2\uffff\1\43\10\uffff\1\62\6\uffff\1\100\16\uffff\1\165\1\uffff"+
        "\1\171\1\172\3\uffff\1\165\1\2\1\3\1\6\1\20\1\4\1\5\1\7\15\uffff"+
        "\1\15\1\67\1\37\4\uffff\1\21\1\22\3\uffff\1\26\1\76\1\104\1\27\1"+
        "\72\1\32\1\71\1\33\1\36\4\uffff\1\43\3\uffff\1\120\1\47\16\uffff"+
        "\1\150\1\62\1\64\1\63\1\65\1\151\1\uffff\1\153\1\66\1\133\1\70\1"+
        "\101\1\73\1\75\1\167\1\170\1\77\1\100\1\103\1\132\12\uffff\1\166"+
        "\2\uffff\1\157\1\156\1\uffff\1\162\1\uffff\1\163\1\164\1\171\14"+
        "\uffff\1\13\7\uffff\1\105\1\uffff\1\102\2\uffff\1\50\1\74\2\uffff"+
        "\1\114\15\uffff\1\147\3\uffff\1\56\1\146\1\152\20\uffff\1\160\11"+
        "\uffff\1\12\1\45\15\uffff\1\40\4\uffff\1\127\1\uffff\1\51\6\uffff"+
        "\1\144\4\uffff\1\112\3\uffff\1\115\1\116\6\uffff\1\155\1\154\3\uffff"+
        "\1\161\10\uffff\1\11\1\123\3\uffff\1\111\6\uffff\1\106\4\uffff\1"+
        "\122\12\uffff\1\57\6\uffff\1\142\1\143\13\uffff\1\117\1\uffff\1"+
        "\31\1\uffff\1\131\12\uffff\1\125\6\uffff\1\54\1\uffff\1\60\2\uffff"+
        "\1\121\1\uffff\1\113\1\uffff\1\141\3\uffff\1\30\2\uffff\1\10\1\24"+
        "\1\107\1\uffff\1\46\1\uffff\1\23\1\uffff\1\17\5\uffff\1\44\1\124"+
        "\1\uffff\1\52\3\uffff\1\55\1\61\2\uffff\1\126\1\1\1\uffff\1\135"+
        "\1\14\3\uffff\1\34\1\110\2\uffff\1\136\4\uffff\1\130\4\uffff\1\42"+
        "\1\41\2\uffff\1\140\1\145\1\134\2\uffff\1\25\1\uffff\1\53\1\16\1"+
        "\35\1\137";
    static final String DFA56_specialS =
        "\1\14\61\uffff\1\0\1\24\5\uffff\1\12\146\uffff\1\25\1\16\2\uffff"+
        "\1\13\101\uffff\1\4\1\3\1\20\1\11\1\uffff\1\15\66\uffff\1\1\1\22"+
        "\2\uffff\1\21\1\2\1\7\56\uffff\1\6\1\23\1\26\1\10\47\uffff\1\17"+
        "\1\5\102\uffff}>";
    static final String[] DFA56_transitionS = {
            "\11\73\2\72\2\73\1\72\22\73\1\72\1\46\1\71\1\3\1\70\1\51\1"+
            "\45\1\62\1\31\1\5\1\23\1\43\1\4\1\47\1\22\1\50\1\65\11\66\1"+
            "\33\1\2\1\24\1\14\1\25\1\52\1\42\1\37\1\35\2\70\1\40\1\34\1"+
            "\57\1\70\1\41\11\70\1\36\1\61\2\70\1\60\3\70\1\17\1\73\1\20"+
            "\1\67\1\70\1\73\1\16\1\12\1\13\1\27\1\21\1\53\2\70\1\15\3\70"+
            "\1\10\1\11\1\30\1\1\1\70\1\56\1\7\1\32\1\70\1\55\1\54\3\70\1"+
            "\26\1\44\1\6\55\73\1\64\17\73\1\63\uff44\73",
            "\1\74\20\uffff\1\76\2\uffff\1\75",
            "",
            "\1\101\122\uffff\1\102",
            "",
            "",
            "",
            "\1\107\13\uffff\1\110\1\112\1\uffff\1\111",
            "\1\113",
            "\1\115\11\uffff\1\114\5\uffff\1\116",
            "\1\117",
            "\1\123\12\uffff\1\121\2\uffff\1\120\2\uffff\1\122",
            "\1\125\1\124",
            "\1\131\6\uffff\1\130\1\127",
            "\1\132",
            "",
            "",
            "\1\136\13\uffff\1\135",
            "\1\137",
            "\1\141\3\uffff\1\142",
            "\1\144",
            "\1\146",
            "",
            "\1\151\3\uffff\1\152\5\uffff\1\153",
            "\1\154",
            "",
            "\1\156\11\uffff\1\157\6\uffff\1\160",
            "\1\161",
            "\1\163\25\uffff\1\164",
            "\1\165\33\uffff\1\166",
            "\1\167\35\uffff\1\170",
            "\1\171\47\uffff\1\172\4\uffff\1\173",
            "\1\175\1\uffff\1\174\51\uffff\1\176",
            "\1\u0081\45\uffff\1\177\47\uffff\1\u0080",
            "",
            "\1\u0083",
            "\1\u0087\1\u0088\2\uffff\1\u0088\22\uffff\1\u0087\133\uffff"+
            "\1\u0085",
            "\1\u0089",
            "\1\u008b",
            "\1\u008d",
            "\1\u008f\4\uffff\1\u0090",
            "",
            "\1\u0093",
            "\1\u0096\7\uffff\1\u0097\5\uffff\1\u0095",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\47\u009f\1\u009e\uffd8\u009f",
            "\47\u00a1\1\u00a0\u0083\u00a1\1\u00a2\uff54\u00a1",
            "\1\u00a4",
            "\12\u00a6\10\uffff\1\u00a8\1\uffff\3\u00a8\5\uffff\1\u00a8"+
            "\13\uffff\1\u00a5\6\uffff\1\u00a6\2\uffff\1\u00a8\1\uffff\3"+
            "\u00a8\5\uffff\1\u00a8\13\uffff\1\u00a5",
            "\12\u00a6\10\uffff\1\u00a8\1\uffff\3\u00a8\5\uffff\1\u00a8"+
            "\22\uffff\1\u00a6\2\uffff\1\u00a8\1\uffff\3\u00a8\5\uffff\1"+
            "\u00a8",
            "\1\77\34\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\0\u009f",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ad\5\uffff\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\1\u00bb",
            "",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\22"+
            "\77\1\u00bf\7\77",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca\3\uffff\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u00da",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087\1\u0088\2\uffff\1\u0088\22\uffff\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e1\5\uffff\1\u00e0",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\47\u00e8\1\u00e7\u0083\u00e8\1\u00a2\uff54\u00e8",
            "\47\u00a1\1\u00a0\u0083\u00a1\1\u00a2\uff54\u00a1",
            "",
            "",
            "\12\u00e9\1\u00eb\2\u00e9\1\u00ea\ufff2\u00e9",
            "",
            "\12\u00a6\10\uffff\1\u00a8\1\uffff\3\u00a8\5\uffff\1\u00a8"+
            "\22\uffff\1\u00a6\2\uffff\1\u00a8\1\uffff\3\u00a8\5\uffff\1"+
            "\u00a8",
            "",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\2\uffff\1\u00ff",
            "",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\1"+
            "\u0104\31\77",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u010b",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114\2\uffff\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\47\u0123\1\u0122\u0083\u0123\1\u0124\uff54\u0123",
            "\47\u0126\1\uffff\u0083\u0126\1\u00a2\uff54\u0126",
            "\47\u00a1\1\u00a0\u0083\u00a1\1\u00a2\uff54\u00a1",
            "\12\u00e9\1\u00eb\2\u00e9\1\u00ea\ufff2\u00e9",
            "\1\u00eb",
            "\47\u0128\1\u0127\u0083\u0128\1\u00ec\uff54\u0128",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\77\13\uffff\12\77\7\uffff\10\77\1\u014d\21\77\4\uffff\1"+
            "\77\1\uffff\32\77",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\47\u0158\1\u0157\u0083\u0158\1\u0124\uff54\u0158",
            "\47\u0123\1\u0122\u0083\u0123\1\u0124\uff54\u0123",
            "",
            "",
            "\47\u00a1\1\u00a0\u0083\u00a1\1\u00a2\uff54\u00a1",
            "\47\u015a\1\u0159\u0083\u015a\1\u00ec\uff54\u015a",
            "\47\u0128\1\u0127\u0083\u0128\1\u00ec\uff54\u0128",
            "",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "",
            "\1\u0163",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0165",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016c\16\uffff\1\u016b",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\22"+
            "\77\1\u0170\7\77",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0179",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u017e",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0180",
            "\1\u0181",
            "",
            "",
            "\47\u0182\1\uffff\u0083\u0182\1\u0124\uff54\u0182",
            "\47\u0123\1\u0122\u0083\u0123\1\u0124\uff54\u0123",
            "\47\u0183\1\uffff\u0083\u0183\1\u00ec\uff54\u0183",
            "\47\u0128\1\u0127\u0083\u0128\1\u00ec\uff54\u0128",
            "\1\u0184",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0186",
            "\1\u0187",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u018b",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u018d",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u018f",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u0198",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u019f",
            "",
            "\1\u01a0",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\47\u0123\1\u0122\u0083\u0123\1\u0124\uff54\u0123",
            "\47\u0128\1\u0127\u0083\u0128\1\u00ec\uff54\u0128",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u01a3",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "",
            "\1\u01ad\26\uffff\1\u01ad\31\uffff\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "",
            "\1\u01b1",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "",
            "\1\u01b3",
            "",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb\26\uffff\1\u01bb\31\uffff\1\u01bb",
            "\1\u01bc\26\uffff\1\u01bc\31\uffff\1\u01bc",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\u01be",
            "\1\u01bf",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "",
            "\1\u01c1",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "",
            "",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32"+
            "\77",
            "",
            "\1\u01c5\26\uffff\1\u01c5\31\uffff\1\u01c5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | RULE_FEATURE_TEXT | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_TEXT | RULE_IN_ORDER_TEXT | RULE_AS_A_TEXT | RULE_I_WANT_TEXT | RULE_PIPE | RULE_PIPE_SPACES | RULE_EXAMPLE_ROW_END | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_50 = input.LA(1);

                        s = -1;
                        if ( (LA56_50=='\'') ) {s = 158;}

                        else if ( ((LA56_50>='\u0000' && LA56_50<='&')||(LA56_50>='(' && LA56_50<='\uFFFF')) ) {s = 159;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_290 = input.LA(1);

                        s = -1;
                        if ( (LA56_290=='\'') ) {s = 343;}

                        else if ( ((LA56_290>='\u0000' && LA56_290<='&')||(LA56_290>='(' && LA56_290<='\u00AA')||(LA56_290>='\u00AC' && LA56_290<='\uFFFF')) ) {s = 344;}

                        else if ( (LA56_290=='\u00AB') ) {s = 292;}

                        else s = 293;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_295 = input.LA(1);

                        s = -1;
                        if ( (LA56_295=='\'') ) {s = 345;}

                        else if ( ((LA56_295>='\u0000' && LA56_295<='&')||(LA56_295>='(' && LA56_295<='\u00AA')||(LA56_295>='\u00AC' && LA56_295<='\uFFFF')) ) {s = 346;}

                        else if ( (LA56_295=='\u00AB') ) {s = 236;}

                        else s = 297;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_231 = input.LA(1);

                        s = -1;
                        if ( ((LA56_231>='\u0000' && LA56_231<='&')||(LA56_231>='(' && LA56_231<='\u00AA')||(LA56_231>='\u00AC' && LA56_231<='\uFFFF')) ) {s = 294;}

                        else if ( (LA56_231=='\u00AB') ) {s = 162;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_230 = input.LA(1);

                        s = -1;
                        if ( (LA56_230=='\'') ) {s = 290;}

                        else if ( ((LA56_230>='\u0000' && LA56_230<='&')||(LA56_230>='(' && LA56_230<='\u00AA')||(LA56_230>='\u00AC' && LA56_230<='\uFFFF')) ) {s = 291;}

                        else if ( (LA56_230=='\u00AB') ) {s = 292;}

                        else s = 293;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_387 = input.LA(1);

                        s = -1;
                        if ( (LA56_387=='\'') ) {s = 295;}

                        else if ( ((LA56_387>='\u0000' && LA56_387<='&')||(LA56_387>='(' && LA56_387<='\u00AA')||(LA56_387>='\u00AC' && LA56_387<='\uFFFF')) ) {s = 296;}

                        else if ( (LA56_387=='\u00AB') ) {s = 236;}

                        else s = 297;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_343 = input.LA(1);

                        s = -1;
                        if ( ((LA56_343>='\u0000' && LA56_343<='&')||(LA56_343>='(' && LA56_343<='\u00AA')||(LA56_343>='\u00AC' && LA56_343<='\uFFFF')) ) {s = 386;}

                        else if ( (LA56_343=='\u00AB') ) {s = 292;}

                        else s = 293;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_296 = input.LA(1);

                        s = -1;
                        if ( (LA56_296=='\'') ) {s = 295;}

                        else if ( ((LA56_296>='\u0000' && LA56_296<='&')||(LA56_296>='(' && LA56_296<='\u00AA')||(LA56_296>='\u00AC' && LA56_296<='\uFFFF')) ) {s = 296;}

                        else if ( (LA56_296=='\u00AB') ) {s = 236;}

                        else s = 297;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_346 = input.LA(1);

                        s = -1;
                        if ( (LA56_346=='\'') ) {s = 295;}

                        else if ( (LA56_346=='\u00AB') ) {s = 236;}

                        else if ( ((LA56_346>='\u0000' && LA56_346<='&')||(LA56_346>='(' && LA56_346<='\u00AA')||(LA56_346>='\u00AC' && LA56_346<='\uFFFF')) ) {s = 296;}

                        else s = 297;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_233 = input.LA(1);

                        s = -1;
                        if ( (LA56_233=='\r') ) {s = 234;}

                        else if ( (LA56_233=='\n') ) {s = 235;}

                        else if ( ((LA56_233>='\u0000' && LA56_233<='\t')||(LA56_233>='\u000B' && LA56_233<='\f')||(LA56_233>='\u000E' && LA56_233<='\uFFFF')) ) {s = 233;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_57 = input.LA(1);

                        s = -1;
                        if ( ((LA56_57>='\u0000' && LA56_57<='\uFFFF')) ) {s = 159;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA56_164 = input.LA(1);

                        s = -1;
                        if ( ((LA56_164>='\u0000' && LA56_164<='\t')||(LA56_164>='\u000B' && LA56_164<='\f')||(LA56_164>='\u000E' && LA56_164<='\uFFFF')) ) {s = 233;}

                        else if ( (LA56_164=='\r') ) {s = 234;}

                        else if ( (LA56_164=='\n') ) {s = 235;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA56_0 = input.LA(1);

                        s = -1;
                        if ( (LA56_0=='p') ) {s = 1;}

                        else if ( (LA56_0==';') ) {s = 2;}

                        else if ( (LA56_0=='#') ) {s = 3;}

                        else if ( (LA56_0==',') ) {s = 4;}

                        else if ( (LA56_0==')') ) {s = 5;}

                        else if ( (LA56_0=='}') ) {s = 6;}

                        else if ( (LA56_0=='s') ) {s = 7;}

                        else if ( (LA56_0=='m') ) {s = 8;}

                        else if ( (LA56_0=='n') ) {s = 9;}

                        else if ( (LA56_0=='b') ) {s = 10;}

                        else if ( (LA56_0=='c') ) {s = 11;}

                        else if ( (LA56_0=='=') ) {s = 12;}

                        else if ( (LA56_0=='i') ) {s = 13;}

                        else if ( (LA56_0=='a') ) {s = 14;}

                        else if ( (LA56_0=='[') ) {s = 15;}

                        else if ( (LA56_0==']') ) {s = 16;}

                        else if ( (LA56_0=='e') ) {s = 17;}

                        else if ( (LA56_0=='.') ) {s = 18;}

                        else if ( (LA56_0=='*') ) {s = 19;}

                        else if ( (LA56_0=='<') ) {s = 20;}

                        else if ( (LA56_0=='>') ) {s = 21;}

                        else if ( (LA56_0=='{') ) {s = 22;}

                        else if ( (LA56_0=='d') ) {s = 23;}

                        else if ( (LA56_0=='o') ) {s = 24;}

                        else if ( (LA56_0=='(') ) {s = 25;}

                        else if ( (LA56_0=='t') ) {s = 26;}

                        else if ( (LA56_0==':') ) {s = 27;}

                        else if ( (LA56_0=='F') ) {s = 28;}

                        else if ( (LA56_0=='B') ) {s = 29;}

                        else if ( (LA56_0=='S') ) {s = 30;}

                        else if ( (LA56_0=='A') ) {s = 31;}

                        else if ( (LA56_0=='E') ) {s = 32;}

                        else if ( (LA56_0=='I') ) {s = 33;}

                        else if ( (LA56_0=='@') ) {s = 34;}

                        else if ( (LA56_0=='+') ) {s = 35;}

                        else if ( (LA56_0=='|') ) {s = 36;}

                        else if ( (LA56_0=='&') ) {s = 37;}

                        else if ( (LA56_0=='!') ) {s = 38;}

                        else if ( (LA56_0=='-') ) {s = 39;}

                        else if ( (LA56_0=='/') ) {s = 40;}

                        else if ( (LA56_0=='%') ) {s = 41;}

                        else if ( (LA56_0=='?') ) {s = 42;}

                        else if ( (LA56_0=='f') ) {s = 43;}

                        else if ( (LA56_0=='w') ) {s = 44;}

                        else if ( (LA56_0=='v') ) {s = 45;}

                        else if ( (LA56_0=='r') ) {s = 46;}

                        else if ( (LA56_0=='G') ) {s = 47;}

                        else if ( (LA56_0=='W') ) {s = 48;}

                        else if ( (LA56_0=='T') ) {s = 49;}

                        else if ( (LA56_0=='\'') ) {s = 50;}

                        else if ( (LA56_0=='\u00BB') ) {s = 51;}

                        else if ( (LA56_0=='\u00AB') ) {s = 52;}

                        else if ( (LA56_0=='0') ) {s = 53;}

                        else if ( ((LA56_0>='1' && LA56_0<='9')) ) {s = 54;}

                        else if ( (LA56_0=='^') ) {s = 55;}

                        else if ( (LA56_0=='$'||(LA56_0>='C' && LA56_0<='D')||LA56_0=='H'||(LA56_0>='J' && LA56_0<='R')||(LA56_0>='U' && LA56_0<='V')||(LA56_0>='X' && LA56_0<='Z')||LA56_0=='_'||(LA56_0>='g' && LA56_0<='h')||(LA56_0>='j' && LA56_0<='l')||LA56_0=='q'||LA56_0=='u'||(LA56_0>='x' && LA56_0<='z')) ) {s = 56;}

                        else if ( (LA56_0=='\"') ) {s = 57;}

                        else if ( ((LA56_0>='\t' && LA56_0<='\n')||LA56_0=='\r'||LA56_0==' ') ) {s = 58;}

                        else if ( ((LA56_0>='\u0000' && LA56_0<='\b')||(LA56_0>='\u000B' && LA56_0<='\f')||(LA56_0>='\u000E' && LA56_0<='\u001F')||LA56_0=='\\'||LA56_0=='`'||(LA56_0>='~' && LA56_0<='\u00AA')||(LA56_0>='\u00AC' && LA56_0<='\u00BA')||(LA56_0>='\u00BC' && LA56_0<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA56_235 = input.LA(1);

                        s = -1;
                        if ( (LA56_235=='\'') ) {s = 295;}

                        else if ( ((LA56_235>='\u0000' && LA56_235<='&')||(LA56_235>='(' && LA56_235<='\u00AA')||(LA56_235>='\u00AC' && LA56_235<='\uFFFF')) ) {s = 296;}

                        else if ( (LA56_235=='\u00AB') ) {s = 236;}

                        else s = 297;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA56_161 = input.LA(1);

                        s = -1;
                        if ( (LA56_161=='\'') ) {s = 160;}

                        else if ( ((LA56_161>='\u0000' && LA56_161<='&')||(LA56_161>='(' && LA56_161<='\u00AA')||(LA56_161>='\u00AC' && LA56_161<='\uFFFF')) ) {s = 161;}

                        else if ( (LA56_161=='\u00AB') ) {s = 162;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA56_386 = input.LA(1);

                        s = -1;
                        if ( (LA56_386=='\'') ) {s = 290;}

                        else if ( (LA56_386=='\u00AB') ) {s = 292;}

                        else if ( ((LA56_386>='\u0000' && LA56_386<='&')||(LA56_386>='(' && LA56_386<='\u00AA')||(LA56_386>='\u00AC' && LA56_386<='\uFFFF')) ) {s = 291;}

                        else s = 293;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA56_232 = input.LA(1);

                        s = -1;
                        if ( (LA56_232=='\'') ) {s = 160;}

                        else if ( ((LA56_232>='\u0000' && LA56_232<='&')||(LA56_232>='(' && LA56_232<='\u00AA')||(LA56_232>='\u00AC' && LA56_232<='\uFFFF')) ) {s = 161;}

                        else if ( (LA56_232=='\u00AB') ) {s = 162;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA56_294 = input.LA(1);

                        s = -1;
                        if ( (LA56_294=='\'') ) {s = 160;}

                        else if ( ((LA56_294>='\u0000' && LA56_294<='&')||(LA56_294>='(' && LA56_294<='\u00AA')||(LA56_294>='\u00AC' && LA56_294<='\uFFFF')) ) {s = 161;}

                        else if ( (LA56_294=='\u00AB') ) {s = 162;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA56_291 = input.LA(1);

                        s = -1;
                        if ( (LA56_291=='\'') ) {s = 290;}

                        else if ( ((LA56_291>='\u0000' && LA56_291<='&')||(LA56_291>='(' && LA56_291<='\u00AA')||(LA56_291>='\u00AC' && LA56_291<='\uFFFF')) ) {s = 291;}

                        else if ( (LA56_291=='\u00AB') ) {s = 292;}

                        else s = 293;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA56_344 = input.LA(1);

                        s = -1;
                        if ( (LA56_344=='\'') ) {s = 290;}

                        else if ( ((LA56_344>='\u0000' && LA56_344<='&')||(LA56_344>='(' && LA56_344<='\u00AA')||(LA56_344>='\u00AC' && LA56_344<='\uFFFF')) ) {s = 291;}

                        else if ( (LA56_344=='\u00AB') ) {s = 292;}

                        else s = 293;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA56_51 = input.LA(1);

                        s = -1;
                        if ( (LA56_51=='\'') ) {s = 160;}

                        else if ( ((LA56_51>='\u0000' && LA56_51<='&')||(LA56_51>='(' && LA56_51<='\u00AA')||(LA56_51>='\u00AC' && LA56_51<='\uFFFF')) ) {s = 161;}

                        else if ( (LA56_51=='\u00AB') ) {s = 162;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA56_160 = input.LA(1);

                        s = -1;
                        if ( (LA56_160=='\'') ) {s = 231;}

                        else if ( ((LA56_160>='\u0000' && LA56_160<='&')||(LA56_160>='(' && LA56_160<='\u00AA')||(LA56_160>='\u00AC' && LA56_160<='\uFFFF')) ) {s = 232;}

                        else if ( (LA56_160=='\u00AB') ) {s = 162;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA56_345 = input.LA(1);

                        s = -1;
                        if ( ((LA56_345>='\u0000' && LA56_345<='&')||(LA56_345>='(' && LA56_345<='\u00AA')||(LA56_345>='\u00AC' && LA56_345<='\uFFFF')) ) {s = 387;}

                        else if ( (LA56_345=='\u00AB') ) {s = 236;}

                        else s = 297;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}