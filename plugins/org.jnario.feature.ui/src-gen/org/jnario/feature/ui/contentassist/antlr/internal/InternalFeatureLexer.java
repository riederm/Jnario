package org.jnario.feature.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLexer extends Lexer {
    public static final int RULE_HEX=5;
    public static final int T__50=50;
    public static final int RULE_THEN_TEXT=14;
    public static final int RULE_FEATURE_TEXT=8;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BACKGROUND_TEXT=10;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_COLON=19;
    public static final int RULE_MNL=18;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=25;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_STEP_WITH_ARGS=20;
    public static final int RULE_SCENARIO_TEXT=11;
    public static final int RULE_GIVEN_TEXT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_AND_TEXT=15;
    public static final int RULE_BUT_TEXT=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=7;
    public static final int T__29=29;
    public static final int RULE_TEXT=9;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int RULE_WHEN_TEXT=13;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=17;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_IN_RICH_STRING=24;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_RICH_TEXT=22;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=27;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_SPACES=21;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int RULE_NL=23;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalFeatureLexer() {;} 
    public InternalFeatureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g"; }

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:11:7: ( '=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:11:9: '='
            {
            match('='); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:12:7: ( '||' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:12:9: '||'
            {
            match("||"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:13:7: ( '&&' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:13:9: '&&'
            {
            match("&&"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:14:7: ( 'throws' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:14:9: 'throws'
            {
            match("throws"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:15:7: ( 'public' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:15:9: 'public'
            {
            match("public"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:16:7: ( 'private' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:16:9: 'private'
            {
            match("private"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:17:7: ( 'protected' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:17:9: 'protected'
            {
            match("protected"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:18:7: ( 'package' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:18:9: 'package'
            {
            match("package"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:19:7: ( 'abstract' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:19:9: 'abstract'
            {
            match("abstract"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:20:7: ( 'static' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:20:9: 'static'
            {
            match("static"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:21:7: ( 'dispatch' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:21:9: 'dispatch'
            {
            match("dispatch"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:22:7: ( 'final' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:22:9: 'final'
            {
            match("final"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:23:7: ( 'strictfp' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:23:9: 'strictfp'
            {
            match("strictfp"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:24:7: ( 'native' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:24:9: 'native'
            {
            match("native"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:25:7: ( 'volatile' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:25:9: 'volatile'
            {
            match("volatile"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:26:7: ( 'synchronized' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:26:9: 'synchronized'
            {
            match("synchronized"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27:7: ( 'transient' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27:9: 'transient'
            {
            match("transient"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:28:7: ( 'val' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:28:9: 'val'
            {
            match("val"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:29:7: ( 'var' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:29:9: 'var'
            {
            match("var"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:30:7: ( 'def' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:30:9: 'def'
            {
            match("def"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:31:7: ( 'override' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:31:9: 'override'
            {
            match("override"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:32:7: ( '+=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:32:9: '+='
            {
            match("+="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:33:7: ( '-=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:33:9: '-='
            {
            match("-="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:34:7: ( '*=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:34:9: '*='
            {
            match("*="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:35:7: ( '/=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:35:9: '/='
            {
            match("/="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:36:7: ( '%=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:36:9: '%='
            {
            match("%="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:37:7: ( '==' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:37:9: '=='
            {
            match("=="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:38:7: ( '!=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:38:9: '!='
            {
            match("!="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:39:7: ( '===' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:39:9: '==='
            {
            match("==="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:40:7: ( '!==' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:40:9: '!=='
            {
            match("!=="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:41:7: ( '>=' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:41:9: '>='
            {
            match(">="); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:42:7: ( '>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:42:9: '>'
            {
            match('>'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:43:7: ( '<' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:43:9: '<'
            {
            match('<'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:44:7: ( '->' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:44:9: '->'
            {
            match("->"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:45:7: ( '..<' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:45:9: '..<'
            {
            match("..<"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:46:7: ( '..' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:46:9: '..'
            {
            match(".."); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:47:7: ( '=>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:47:9: '=>'
            {
            match("=>"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:48:7: ( '<>' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:48:9: '<>'
            {
            match("<>"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:49:7: ( '?:' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:49:9: '?:'
            {
            match("?:"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:50:7: ( '+' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:50:9: '+'
            {
            match('+'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:51:7: ( '-' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:51:9: '-'
            {
            match('-'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:52:7: ( '*' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:52:9: '*'
            {
            match('*'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:53:7: ( '**' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:53:9: '**'
            {
            match("**"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:54:7: ( '/' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:54:9: '/'
            {
            match('/'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:55:7: ( '%' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:55:9: '%'
            {
            match('%'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:56:7: ( '!' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:56:9: '!'
            {
            match('!'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:57:7: ( '++' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:57:9: '++'
            {
            match("++"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:58:7: ( '--' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:58:9: '--'
            {
            match("--"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:59:7: ( '.' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:59:9: '.'
            {
            match('.'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:60:7: ( 'extends' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:60:9: 'extends'
            {
            match("extends"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:61:7: ( 'import' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:61:9: 'import'
            {
            match("import"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:62:7: ( 'extension' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:62:9: 'extension'
            {
            match("extension"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:63:7: ( 'super' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:63:9: 'super'
            {
            match("super"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:64:7: ( 'false' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:64:9: 'false'
            {
            match("false"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:65:7: ( ';' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:65:9: ';'
            {
            match(';'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:66:7: ( 'should' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:66:9: 'should'
            {
            match("should"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:67:7: ( 'throw' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:67:9: 'throw'
            {
            match("throw"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:68:7: ( 'instanceof' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:68:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:69:7: ( 'not' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:69:9: 'not'
            {
            match("not"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:70:7: ( 'assert' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:70:9: 'assert'
            {
            match("assert"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:71:7: ( '@' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:71:9: '@'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:72:7: ( '(' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:72:9: '('
            {
            match('('); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:73:7: ( ')' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:73:9: ')'
            {
            match(')'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:74:7: ( ',' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:74:9: ','
            {
            match(','); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:75:7: ( ']' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:75:9: ']'
            {
            match(']'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:76:7: ( '#' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:76:9: '#'
            {
            match('#'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:77:7: ( '[' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:77:9: '['
            {
            match('['); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:78:7: ( 'as' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:78:9: 'as'
            {
            match("as"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:79:7: ( '{' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:79:9: '{'
            {
            match('{'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:80:7: ( '}' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:80:9: '}'
            {
            match('}'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:81:7: ( 'if' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:81:9: 'if'
            {
            match("if"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:82:8: ( 'else' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:82:10: 'else'
            {
            match("else"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:83:8: ( 'switch' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:83:10: 'switch'
            {
            match("switch"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:84:8: ( ':' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:84:10: ':'
            {
            match(':'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:85:8: ( 'default' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:85:10: 'default'
            {
            match("default"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:86:8: ( 'case' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:86:10: 'case'
            {
            match("case"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:87:8: ( 'for' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:87:10: 'for'
            {
            match("for"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:88:8: ( 'while' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:88:10: 'while'
            {
            match("while"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:89:8: ( 'do' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:89:10: 'do'
            {
            match("do"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:90:8: ( 'new' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:90:10: 'new'
            {
            match("new"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:91:8: ( 'null' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:91:10: 'null'
            {
            match("null"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:92:8: ( 'typeof' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:92:10: 'typeof'
            {
            match("typeof"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:93:8: ( 'return' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:93:10: 'return'
            {
            match("return"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:94:8: ( 'try' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:94:10: 'try'
            {
            match("try"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:95:8: ( 'finally' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:95:10: 'finally'
            {
            match("finally"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:96:8: ( 'catch' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:96:10: 'catch'
            {
            match("catch"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:97:8: ( '?' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:97:10: '?'
            {
            match('?'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:98:8: ( '&' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:98:10: '&'
            {
            match('&'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:99:8: ( '...' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:99:10: '...'
            {
            match("..."); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:100:8: ( '::' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:100:10: '::'
            {
            match("::"); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:101:8: ( '?.' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:101:10: '?.'
            {
            match("?."); 


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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:102:8: ( '|' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:102:10: '|'
            {
            match('|'); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:103:8: ( 'true' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:103:10: 'true'
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

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27025:22: ( 'Background:' RULE_MNL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27025:24: 'Background:' RULE_MNL
            {
            match("Background:"); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27027:20: ( 'Scenario:' RULE_MNL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27027:22: 'Scenario:' RULE_MNL
            {
            match("Scenario:"); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:19: ( 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:21: 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            {
            match("Feature"); 

            mRULE_COLON(); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:42: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:70: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:74: ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='B') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:75: RULE_BACKGROUND_TEXT
                    {
                    mRULE_BACKGROUND_TEXT(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27029:96: RULE_SCENARIO_TEXT
                    {
                    mRULE_SCENARIO_TEXT(); 

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
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27031:17: ( 'Given ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27031:19: 'Given ' RULE_STEP_WITH_ARGS
            {
            match("Given "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27033:16: ( 'When ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27033:18: 'When ' RULE_STEP_WITH_ARGS
            {
            match("When "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27035:16: ( 'Then ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27035:18: 'Then ' RULE_STEP_WITH_ARGS
            {
            match("Then "); 

            mRULE_STEP_WITH_ARGS(); 

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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27037:15: ( 'And ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27037:17: 'And ' RULE_STEP_WITH_ARGS
            {
            match("And "); 

            mRULE_STEP_WITH_ARGS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_BUT_TEXT"
    public final void mRULE_BUT_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BUT_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27039:15: ( 'But ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27039:17: 'But ' RULE_STEP_WITH_ARGS
            {
            match("But "); 

            mRULE_STEP_WITH_ARGS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BUT_TEXT"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27041:11: ( ( '____dummy____' )+ )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27041:13: ( '____dummy____' )+
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27041:13: ( '____dummy____' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='_') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27041:13: '____dummy____'
            	    {
            	    match("____dummy____"); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_STEP_WITH_ARGS"
    public final void mRULE_STEP_WITH_ARGS() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:30: ( (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' RULE_SPACES ( RULE_RICH_TEXT )? RULE_SPACES | EOF ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:32: (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' RULE_SPACES ( RULE_RICH_TEXT )? RULE_SPACES | EOF )
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:32: (~ ( ( '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:32: ~ ( ( '\\r' | '\\n' ) )
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

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:48: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:48: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:54: ( '\\n' RULE_SPACES ( RULE_RICH_TEXT )? RULE_SPACES | EOF )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n') ) {
                alt7=1;
            }
            else {
                alt7=2;}
            switch (alt7) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:55: '\\n' RULE_SPACES ( RULE_RICH_TEXT )? RULE_SPACES
                    {
                    match('\n'); 
                    mRULE_SPACES(); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:72: ( RULE_RICH_TEXT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:72: RULE_RICH_TEXT
                            {
                            mRULE_RICH_TEXT(); 

                            }
                            break;

                    }

                    mRULE_SPACES(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27043:100: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEP_WITH_ARGS"

    // $ANTLR start "RULE_MNL"
    public final void mRULE_MNL() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27045:19: ( (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27045:21: (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27045:21: (~ ( ( '\\r' | '\\n' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27045:21: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop8;
                }
            } while (true);

            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MNL"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27047:21: ( RULE_SPACES ':' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27047:23: RULE_SPACES ':'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27049:18: ( ( '\\r' )? ( '\\n' )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27049:20: ( '\\r' )? ( '\\n' )?
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27049:20: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27049:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27049:26: ( '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27049:26: '\\n'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27051:22: ( ( ' ' | '\\t' )* )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27051:24: ( ' ' | '\\t' )*
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27051:24: ( ' ' | '\\t' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    break loop11;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:27: ( RULE_IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='\'') ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3=='\'') ) {
                        alt15=1;
                    }
                    else {
                        alt15=2;}
                }
                else {
                    alt15=2;}
            }
            else {
                alt15=2;}
            switch (alt15) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:58: ( '\\'' ( '\\'' )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:64: ( '\\'' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='\'') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27053:64: '\\''
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

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27055:30: ( ( '\\'\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) ) | '\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) ) | ~ ( ( '\\u0000\\u0000' | '\\'' ) ) ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27055:32: ( '\\'\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) ) | '\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) ) | ~ ( ( '\\u0000\\u0000' | '\\'' ) ) )
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27055:32: ( '\\'\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) ) | '\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) ) | ~ ( ( '\\u0000\\u0000' | '\\'' ) ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\'') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='\'') ) {
                    alt16=1;
                }
                else if ( ((LA16_1>='\u0000' && LA16_1<='&')||(LA16_1>='(' && LA16_1<='\uFFFF')) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='\uFFFF')) ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27055:33: '\\'\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27055:65: '\\'' ~ ( ( '\\u0000\\u0000' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27055:95: ~ ( ( '\\u0000\\u0000' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:12: ( '0x' | '0X' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='0') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='x') ) {
                    alt17=1;
                }
                else if ( (LA17_1=='X') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='F')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='f')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='#') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='B'||LA19_0=='b') ) {
                        alt19=1;
                    }
                    else if ( (LA19_0=='L'||LA19_0=='l') ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27057:84: ( 'l' | 'L' )
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27059:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27059:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27059:21: ( '0' .. '9' | '_' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||LA21_0=='_') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    break loop21;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='E'||LA23_0=='e') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:36: ( '+' | '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='+'||LA22_0=='-') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='B'||LA24_0=='b') ) {
                alt24=1;
            }
            else if ( (LA24_0=='D'||LA24_0=='F'||LA24_0=='L'||LA24_0=='d'||LA24_0=='f'||LA24_0=='l') ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27061:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27063:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27063:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27063:11: ( '^' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='^') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27063:11: '^'
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

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27063:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='$'||(LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    break loop26;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\"') ) {
                alt31=1;
            }
            else if ( (LA31_0=='\'') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop27;
                        }
                    } while (true);

                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:44: ( '\"' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\"') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\\') ) {
                            alt29=1;
                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\uFFFF')) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:62: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop29;
                        }
                    } while (true);

                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:79: ( '\\'' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\'') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27065:79: '\\''
                            {
                            match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27067:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27067:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27067:24: ( options {greedy=false; } : . )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='*') ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1=='/') ) {
                        alt32=2;
                    }
                    else if ( ((LA32_1>='\u0000' && LA32_1<='.')||(LA32_1>='0' && LA32_1<='\uFFFF')) ) {
                        alt32=1;
                    }


                }
                else if ( ((LA32_0>='\u0000' && LA32_0<=')')||(LA32_0>='+' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27067:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop33;
                }
            } while (true);

            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:40: ( ( '\\r' )? '\\n' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\n'||LA35_0=='\r') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:41: ( '\\r' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='\r') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27069:41: '\\r'
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27071:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27071:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27071:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27073:16: ( . )
            // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:27073:18: .
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
        // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_BUT_TEXT | RULE_TEXT | RULE_RICH_TEXT | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt37=112;
        alt37 = dfa37.predict(input);
        switch (alt37) {
            case 1 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:10: T__29
                {
                mT__29(); 

                }
                break;
            case 2 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:16: T__30
                {
                mT__30(); 

                }
                break;
            case 3 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:22: T__31
                {
                mT__31(); 

                }
                break;
            case 4 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:28: T__32
                {
                mT__32(); 

                }
                break;
            case 5 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:34: T__33
                {
                mT__33(); 

                }
                break;
            case 6 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:40: T__34
                {
                mT__34(); 

                }
                break;
            case 7 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:46: T__35
                {
                mT__35(); 

                }
                break;
            case 8 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:52: T__36
                {
                mT__36(); 

                }
                break;
            case 9 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:58: T__37
                {
                mT__37(); 

                }
                break;
            case 10 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:64: T__38
                {
                mT__38(); 

                }
                break;
            case 11 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:70: T__39
                {
                mT__39(); 

                }
                break;
            case 12 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:76: T__40
                {
                mT__40(); 

                }
                break;
            case 13 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:82: T__41
                {
                mT__41(); 

                }
                break;
            case 14 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:88: T__42
                {
                mT__42(); 

                }
                break;
            case 15 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:94: T__43
                {
                mT__43(); 

                }
                break;
            case 16 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:100: T__44
                {
                mT__44(); 

                }
                break;
            case 17 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:106: T__45
                {
                mT__45(); 

                }
                break;
            case 18 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:112: T__46
                {
                mT__46(); 

                }
                break;
            case 19 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:118: T__47
                {
                mT__47(); 

                }
                break;
            case 20 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:124: T__48
                {
                mT__48(); 

                }
                break;
            case 21 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:130: T__49
                {
                mT__49(); 

                }
                break;
            case 22 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:136: T__50
                {
                mT__50(); 

                }
                break;
            case 23 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:142: T__51
                {
                mT__51(); 

                }
                break;
            case 24 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:148: T__52
                {
                mT__52(); 

                }
                break;
            case 25 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:154: T__53
                {
                mT__53(); 

                }
                break;
            case 26 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:160: T__54
                {
                mT__54(); 

                }
                break;
            case 27 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:166: T__55
                {
                mT__55(); 

                }
                break;
            case 28 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:172: T__56
                {
                mT__56(); 

                }
                break;
            case 29 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:178: T__57
                {
                mT__57(); 

                }
                break;
            case 30 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:184: T__58
                {
                mT__58(); 

                }
                break;
            case 31 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:190: T__59
                {
                mT__59(); 

                }
                break;
            case 32 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:196: T__60
                {
                mT__60(); 

                }
                break;
            case 33 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:202: T__61
                {
                mT__61(); 

                }
                break;
            case 34 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:208: T__62
                {
                mT__62(); 

                }
                break;
            case 35 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:214: T__63
                {
                mT__63(); 

                }
                break;
            case 36 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:220: T__64
                {
                mT__64(); 

                }
                break;
            case 37 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:226: T__65
                {
                mT__65(); 

                }
                break;
            case 38 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:232: T__66
                {
                mT__66(); 

                }
                break;
            case 39 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:238: T__67
                {
                mT__67(); 

                }
                break;
            case 40 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:244: T__68
                {
                mT__68(); 

                }
                break;
            case 41 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:250: T__69
                {
                mT__69(); 

                }
                break;
            case 42 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:256: T__70
                {
                mT__70(); 

                }
                break;
            case 43 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:262: T__71
                {
                mT__71(); 

                }
                break;
            case 44 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:268: T__72
                {
                mT__72(); 

                }
                break;
            case 45 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:274: T__73
                {
                mT__73(); 

                }
                break;
            case 46 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:280: T__74
                {
                mT__74(); 

                }
                break;
            case 47 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:286: T__75
                {
                mT__75(); 

                }
                break;
            case 48 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:292: T__76
                {
                mT__76(); 

                }
                break;
            case 49 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:298: T__77
                {
                mT__77(); 

                }
                break;
            case 50 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:304: T__78
                {
                mT__78(); 

                }
                break;
            case 51 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:310: T__79
                {
                mT__79(); 

                }
                break;
            case 52 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:316: T__80
                {
                mT__80(); 

                }
                break;
            case 53 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:322: T__81
                {
                mT__81(); 

                }
                break;
            case 54 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:328: T__82
                {
                mT__82(); 

                }
                break;
            case 55 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:334: T__83
                {
                mT__83(); 

                }
                break;
            case 56 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:340: T__84
                {
                mT__84(); 

                }
                break;
            case 57 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:346: T__85
                {
                mT__85(); 

                }
                break;
            case 58 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:352: T__86
                {
                mT__86(); 

                }
                break;
            case 59 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:358: T__87
                {
                mT__87(); 

                }
                break;
            case 60 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:364: T__88
                {
                mT__88(); 

                }
                break;
            case 61 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:370: T__89
                {
                mT__89(); 

                }
                break;
            case 62 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:376: T__90
                {
                mT__90(); 

                }
                break;
            case 63 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:382: T__91
                {
                mT__91(); 

                }
                break;
            case 64 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:388: T__92
                {
                mT__92(); 

                }
                break;
            case 65 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:394: T__93
                {
                mT__93(); 

                }
                break;
            case 66 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:400: T__94
                {
                mT__94(); 

                }
                break;
            case 67 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:406: T__95
                {
                mT__95(); 

                }
                break;
            case 68 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:412: T__96
                {
                mT__96(); 

                }
                break;
            case 69 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:418: T__97
                {
                mT__97(); 

                }
                break;
            case 70 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:424: T__98
                {
                mT__98(); 

                }
                break;
            case 71 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:430: T__99
                {
                mT__99(); 

                }
                break;
            case 72 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:436: T__100
                {
                mT__100(); 

                }
                break;
            case 73 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:443: T__101
                {
                mT__101(); 

                }
                break;
            case 74 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:450: T__102
                {
                mT__102(); 

                }
                break;
            case 75 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:457: T__103
                {
                mT__103(); 

                }
                break;
            case 76 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:464: T__104
                {
                mT__104(); 

                }
                break;
            case 77 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:471: T__105
                {
                mT__105(); 

                }
                break;
            case 78 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:478: T__106
                {
                mT__106(); 

                }
                break;
            case 79 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:485: T__107
                {
                mT__107(); 

                }
                break;
            case 80 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:492: T__108
                {
                mT__108(); 

                }
                break;
            case 81 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:499: T__109
                {
                mT__109(); 

                }
                break;
            case 82 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:506: T__110
                {
                mT__110(); 

                }
                break;
            case 83 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:513: T__111
                {
                mT__111(); 

                }
                break;
            case 84 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:520: T__112
                {
                mT__112(); 

                }
                break;
            case 85 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:527: T__113
                {
                mT__113(); 

                }
                break;
            case 86 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:534: T__114
                {
                mT__114(); 

                }
                break;
            case 87 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:541: T__115
                {
                mT__115(); 

                }
                break;
            case 88 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:548: T__116
                {
                mT__116(); 

                }
                break;
            case 89 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:555: T__117
                {
                mT__117(); 

                }
                break;
            case 90 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:562: T__118
                {
                mT__118(); 

                }
                break;
            case 91 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:569: T__119
                {
                mT__119(); 

                }
                break;
            case 92 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:576: T__120
                {
                mT__120(); 

                }
                break;
            case 93 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:583: T__121
                {
                mT__121(); 

                }
                break;
            case 94 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:590: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 95 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:611: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 96 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:630: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 97 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:648: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 98 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:664: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 99 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:679: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 100 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:694: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 101 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:708: RULE_BUT_TEXT
                {
                mRULE_BUT_TEXT(); 

                }
                break;
            case 102 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:722: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 103 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:732: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 104 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:747: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 105 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:756: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 106 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:765: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 107 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:778: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 108 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:786: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 109 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:798: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 110 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:814: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 111 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:830: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 112 :
                // ../org.jnario.feature.ui/src-gen/org/jnario/feature/ui/contentassist/antlr/internal/InternalFeature.g:1:838: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\26\uffff";
    static final String DFA1_minS =
        "\3\0\1\uffff\17\0\1\uffff\1\0\1\uffff";
    static final String DFA1_maxS =
        "\3\uffff\1\uffff\17\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\17\uffff\1\2\1\uffff\1\2";
    static final String DFA1_specialS =
        "\1\4\1\5\1\17\1\uffff\1\6\1\20\1\7\1\21\1\10\1\22\1\11\1\0\1\12"+
        "\1\1\1\13\1\2\1\14\1\3\1\15\1\uffff\1\16\1\uffff}>";
    static final String[] DFA1_transitionS = {
            "\102\3\1\1\20\3\1\2\uffac\3",
            "\141\3\1\4\uff9e\3",
            "\143\3\1\5\uff9c\3",
            "",
            "\143\3\1\6\uff9c\3",
            "\145\3\1\7\uff9a\3",
            "\153\3\1\10\uff94\3",
            "\156\3\1\11\uff91\3",
            "\147\3\1\12\uff98\3",
            "\141\3\1\13\uff9e\3",
            "\162\3\1\14\uff8d\3",
            "\162\3\1\15\uff8d\3",
            "\157\3\1\16\uff90\3",
            "\151\3\1\17\uff96\3",
            "\165\3\1\20\uff8a\3",
            "\157\3\1\21\uff90\3",
            "\156\3\1\22\uff91\3",
            "\72\3\1\23\uffc5\3",
            "\144\3\1\24\uff9b\3",
            "",
            "\72\3\1\25\uffc5\3",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    static class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 27029:42: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_11 = input.LA(1);

                        s = -1;
                        if ( (LA1_11=='r') ) {s = 13;}

                        else if ( ((LA1_11>='\u0000' && LA1_11<='q')||(LA1_11>='s' && LA1_11<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_13 = input.LA(1);

                        s = -1;
                        if ( (LA1_13=='i') ) {s = 15;}

                        else if ( ((LA1_13>='\u0000' && LA1_13<='h')||(LA1_13>='j' && LA1_13<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_15 = input.LA(1);

                        s = -1;
                        if ( (LA1_15=='o') ) {s = 17;}

                        else if ( ((LA1_15>='\u0000' && LA1_15<='n')||(LA1_15>='p' && LA1_15<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_17 = input.LA(1);

                        s = -1;
                        if ( (LA1_17==':') ) {s = 19;}

                        else if ( ((LA1_17>='\u0000' && LA1_17<='9')||(LA1_17>=';' && LA1_17<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='B') ) {s = 1;}

                        else if ( (LA1_0=='S') ) {s = 2;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='A')||(LA1_0>='C' && LA1_0<='R')||(LA1_0>='T' && LA1_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_1 = input.LA(1);

                        s = -1;
                        if ( (LA1_1=='a') ) {s = 4;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='`')||(LA1_1>='b' && LA1_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_4 = input.LA(1);

                        s = -1;
                        if ( (LA1_4=='c') ) {s = 6;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='b')||(LA1_4>='d' && LA1_4<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_6 = input.LA(1);

                        s = -1;
                        if ( (LA1_6=='k') ) {s = 8;}

                        else if ( ((LA1_6>='\u0000' && LA1_6<='j')||(LA1_6>='l' && LA1_6<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_8 = input.LA(1);

                        s = -1;
                        if ( (LA1_8=='g') ) {s = 10;}

                        else if ( ((LA1_8>='\u0000' && LA1_8<='f')||(LA1_8>='h' && LA1_8<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                        s = -1;
                        if ( (LA1_10=='r') ) {s = 12;}

                        else if ( ((LA1_10>='\u0000' && LA1_10<='q')||(LA1_10>='s' && LA1_10<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_12 = input.LA(1);

                        s = -1;
                        if ( (LA1_12=='o') ) {s = 14;}

                        else if ( ((LA1_12>='\u0000' && LA1_12<='n')||(LA1_12>='p' && LA1_12<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_14 = input.LA(1);

                        s = -1;
                        if ( (LA1_14=='u') ) {s = 16;}

                        else if ( ((LA1_14>='\u0000' && LA1_14<='t')||(LA1_14>='v' && LA1_14<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_16 = input.LA(1);

                        s = -1;
                        if ( (LA1_16=='n') ) {s = 18;}

                        else if ( ((LA1_16>='\u0000' && LA1_16<='m')||(LA1_16>='o' && LA1_16<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_18 = input.LA(1);

                        s = -1;
                        if ( (LA1_18=='d') ) {s = 20;}

                        else if ( ((LA1_18>='\u0000' && LA1_18<='c')||(LA1_18>='e' && LA1_18<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_20 = input.LA(1);

                        s = -1;
                        if ( (LA1_20==':') ) {s = 21;}

                        else if ( ((LA1_20>='\u0000' && LA1_20<='9')||(LA1_20>=';' && LA1_20<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_2 = input.LA(1);

                        s = -1;
                        if ( (LA1_2=='c') ) {s = 5;}

                        else if ( ((LA1_2>='\u0000' && LA1_2<='b')||(LA1_2>='d' && LA1_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_5 = input.LA(1);

                        s = -1;
                        if ( (LA1_5=='e') ) {s = 7;}

                        else if ( ((LA1_5>='\u0000' && LA1_5<='d')||(LA1_5>='f' && LA1_5<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_7 = input.LA(1);

                        s = -1;
                        if ( (LA1_7=='n') ) {s = 9;}

                        else if ( ((LA1_7>='\u0000' && LA1_7<='m')||(LA1_7>='o' && LA1_7<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_9 = input.LA(1);

                        s = -1;
                        if ( (LA1_9=='a') ) {s = 11;}

                        else if ( ((LA1_9>='\u0000' && LA1_9<='`')||(LA1_9>='b' && LA1_9<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\1\uffff\1\71\1\73\1\75\11\101\1\133\1\137\1\142\1\146\1\150\1"+
        "\152\1\154\1\156\1\160\1\163\2\101\12\uffff\1\u0084\13\101\1\u0092"+
        "\2\u0095\1\66\4\uffff\1\u0099\6\uffff\3\101\1\uffff\4\101\1\u00a5"+
        "\7\101\1\u00ae\12\101\20\uffff\1\u00bb\5\uffff\1\u00be\4\uffff\4"+
        "\101\1\u00c3\14\uffff\14\101\1\u0092\2\uffff\1\u0095\5\uffff\2\101"+
        "\1\u00d4\10\101\1\uffff\7\101\1\u00e5\1\uffff\2\101\1\u00e8\1\101"+
        "\1\u00ea\1\u00eb\2\101\1\u00ee\1\u00ef\1\101\5\uffff\4\101\1\uffff"+
        "\15\101\1\uffff\2\101\1\uffff\1\u0104\17\101\1\uffff\2\101\1\uffff"+
        "\1\101\2\uffff\1\u0117\1\101\2\uffff\2\101\1\u011b\2\101\1\u011e"+
        "\4\101\1\uffff\5\101\1\uffff\1\101\1\u012a\1\101\1\uffff\12\101"+
        "\1\u0136\4\101\1\u013c\1\u013d\1\101\1\uffff\3\101\1\uffff\2\101"+
        "\1\uffff\1\u0145\1\u0146\5\101\2\uffff\1\101\1\u014d\1\uffff\1\101"+
        "\1\u014f\1\u0150\4\101\1\u0155\1\u0156\2\101\1\uffff\1\u0159\1\u015a"+
        "\3\101\2\uffff\1\u015e\4\101\1\u0163\1\101\2\uffff\1\u0165\3\101"+
        "\1\uffff\1\101\1\uffff\1\101\2\uffff\1\u016b\1\101\1\u016d\1\101"+
        "\2\uffff\2\101\2\uffff\1\101\1\u0172\1\u0173\1\uffff\2\101\1\u0176"+
        "\1\101\1\uffff\1\101\1\uffff\5\101\1\uffff\1\101\1\uffff\1\u017f"+
        "\1\u0180\1\101\1\u0182\2\uffff\1\u0183\1\u0184\1\uffff\4\101\1\uffff"+
        "\1\101\1\u018a\1\u018b\2\uffff\1\101\3\uffff\1\u018d\2\101\1\uffff"+
        "\1\101\2\uffff\1\101\1\uffff\1\u0192\3\101\2\uffff\1\101\1\u0197"+
        "\1\101\1\uffff\1\u0199\1\uffff\1\101";
    static final String DFA37_eofS =
        "\u019b\uffff";
    static final String DFA37_minS =
        "\1\0\1\75\1\174\1\46\1\150\1\141\1\142\1\150\1\145\3\141\1\166"+
        "\1\53\1\55\2\52\3\75\1\76\2\56\1\154\1\146\12\uffff\1\72\1\141\1"+
        "\150\1\145\1\141\1\143\1\145\1\151\2\150\1\156\1\137\1\47\2\60\1"+
        "\44\4\uffff\1\75\6\uffff\1\162\1\141\1\160\1\uffff\1\142\1\151\1"+
        "\143\1\163\1\44\1\141\1\156\1\160\1\157\1\151\1\163\1\146\1\44\1"+
        "\156\1\154\1\162\2\164\1\167\3\154\1\145\20\uffff\1\75\5\uffff\1"+
        "\56\4\uffff\1\164\1\163\1\160\1\163\1\44\14\uffff\1\163\1\151\1"+
        "\164\1\143\1\164\1\145\1\141\1\166\2\145\1\144\1\137\1\47\2\uffff"+
        "\1\60\5\uffff\1\157\1\156\1\44\2\145\1\154\1\166\1\164\1\153\1\164"+
        "\1\145\1\uffff\1\164\1\151\1\143\1\145\1\165\1\164\1\160\1\44\1"+
        "\uffff\1\141\1\163\1\44\1\151\2\44\1\154\1\141\2\44\1\162\5\uffff"+
        "\2\145\1\157\1\164\1\uffff\1\145\1\143\1\154\1\165\1\153\1\40\1"+
        "\156\1\164\1\145\2\156\1\40\1\137\1\uffff\1\167\1\163\1\uffff\1"+
        "\44\1\157\1\151\1\141\1\145\1\141\2\162\1\151\1\143\1\150\1\162"+
        "\1\154\1\143\1\141\1\165\1\uffff\1\154\1\145\1\uffff\1\166\2\uffff"+
        "\1\44\1\164\2\uffff\1\162\1\156\1\44\1\162\1\141\1\44\1\150\1\145"+
        "\1\162\1\147\1\uffff\1\141\1\165\1\156\2\40\1\uffff\1\144\1\44\1"+
        "\151\1\uffff\1\146\1\143\1\164\1\143\1\147\1\141\1\164\1\143\1\164"+
        "\1\162\1\44\1\144\1\150\1\164\1\154\2\44\1\145\1\uffff\2\151\1\144"+
        "\1\uffff\1\164\1\156\1\uffff\2\44\1\156\3\162\1\40\2\uffff\1\165"+
        "\1\44\1\uffff\1\145\2\44\1\145\1\164\1\145\1\143\2\44\1\146\1\157"+
        "\1\uffff\2\44\1\143\1\164\1\171\2\uffff\1\44\1\154\1\144\1\163\1"+
        "\151\1\44\1\143\2\uffff\1\44\1\157\1\151\1\145\1\uffff\1\155\1\uffff"+
        "\1\156\2\uffff\1\44\1\145\1\44\1\164\2\uffff\1\160\1\156\2\uffff"+
        "\1\150\2\44\1\uffff\2\145\1\44\1\157\1\uffff\1\145\1\uffff\1\165"+
        "\1\157\1\11\1\155\1\164\1\uffff\1\144\1\uffff\2\44\1\151\1\44\2"+
        "\uffff\2\44\1\uffff\1\156\1\157\1\156\1\72\1\uffff\1\171\2\44\2"+
        "\uffff\1\172\3\uffff\1\44\1\146\1\144\1\uffff\1\137\2\uffff\1\145"+
        "\1\uffff\1\44\1\72\1\137\1\144\2\uffff\1\137\1\44\1\137\1\uffff"+
        "\1\44\1\uffff\1\137";
    static final String DFA37_maxS =
        "\1\uffff\1\76\1\174\1\46\1\171\1\165\1\163\1\171\2\157\1\165\1"+
        "\157\1\166\1\75\1\76\5\75\1\76\1\56\1\72\1\170\1\156\12\uffff\1"+
        "\72\1\141\1\150\1\145\1\165\1\143\1\145\1\151\2\150\1\156\1\137"+
        "\1\47\1\170\1\154\1\172\4\uffff\1\75\6\uffff\1\162\1\171\1\160\1"+
        "\uffff\1\142\1\157\1\143\1\163\1\172\1\162\1\156\1\160\1\157\1\151"+
        "\1\163\1\146\1\172\1\156\1\154\1\162\2\164\1\167\2\154\1\162\1\145"+
        "\20\uffff\1\75\5\uffff\1\74\4\uffff\1\164\1\163\1\160\1\163\1\172"+
        "\14\uffff\1\164\1\151\1\164\1\143\1\164\1\145\1\141\1\166\2\145"+
        "\1\144\1\137\1\47\2\uffff\1\154\5\uffff\1\157\1\156\1\172\2\145"+
        "\1\154\1\166\1\164\1\153\1\164\1\145\1\uffff\1\164\1\151\1\143\1"+
        "\145\1\165\1\164\1\160\1\172\1\uffff\1\141\1\163\1\172\1\151\2\172"+
        "\1\154\1\141\2\172\1\162\5\uffff\2\145\1\157\1\164\1\uffff\1\145"+
        "\1\143\1\154\1\165\1\153\1\40\1\156\1\164\1\145\2\156\1\40\1\137"+
        "\1\uffff\1\167\1\163\1\uffff\1\172\1\157\1\151\1\141\1\145\1\141"+
        "\2\162\1\151\1\143\1\150\1\162\1\154\1\143\1\141\1\165\1\uffff\1"+
        "\154\1\145\1\uffff\1\166\2\uffff\1\172\1\164\2\uffff\1\162\1\156"+
        "\1\172\1\162\1\141\1\172\1\150\1\145\1\162\1\147\1\uffff\1\141\1"+
        "\165\1\156\2\40\1\uffff\1\144\1\172\1\151\1\uffff\1\146\1\143\1"+
        "\164\1\143\1\147\1\141\1\164\1\143\1\164\1\162\1\172\1\144\1\150"+
        "\1\164\1\154\2\172\1\145\1\uffff\2\151\1\163\1\uffff\1\164\1\156"+
        "\1\uffff\2\172\1\156\3\162\1\40\2\uffff\1\165\1\172\1\uffff\1\145"+
        "\2\172\1\145\1\164\1\145\1\143\2\172\1\146\1\157\1\uffff\2\172\1"+
        "\143\1\164\1\171\2\uffff\1\172\1\154\1\144\1\163\1\151\1\172\1\143"+
        "\2\uffff\1\172\1\157\1\151\1\145\1\uffff\1\155\1\uffff\1\156\2\uffff"+
        "\1\172\1\145\1\172\1\164\2\uffff\1\160\1\156\2\uffff\1\150\2\172"+
        "\1\uffff\2\145\1\172\1\157\1\uffff\1\145\1\uffff\1\165\1\157\1\72"+
        "\1\155\1\164\1\uffff\1\144\1\uffff\2\172\1\151\1\172\2\uffff\2\172"+
        "\1\uffff\1\156\1\157\1\156\1\72\1\uffff\1\171\2\172\2\uffff\1\172"+
        "\3\uffff\1\172\1\146\1\144\1\uffff\1\137\2\uffff\1\145\1\uffff\1"+
        "\172\1\72\1\137\1\144\2\uffff\1\137\1\172\1\137\1\uffff\1\172\1"+
        "\uffff\1\137";
    static final String DFA37_acceptS =
        "\31\uffff\1\67\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\105\1\106"+
        "\20\uffff\1\153\1\154\1\157\1\160\1\uffff\1\45\1\1\1\2\1\134\1\3"+
        "\1\130\3\uffff\1\153\27\uffff\1\26\1\57\1\50\1\27\1\42\1\60\1\51"+
        "\1\30\1\53\1\52\1\31\1\155\1\156\1\54\1\32\1\55\1\uffff\1\56\1\37"+
        "\1\40\1\46\1\41\1\uffff\1\61\1\47\1\133\1\127\5\uffff\1\67\1\75"+
        "\1\76\1\77\1\100\1\101\1\102\1\103\1\105\1\106\1\132\1\112\15\uffff"+
        "\1\154\1\150\1\uffff\1\151\1\152\1\157\1\35\1\33\13\uffff\1\104"+
        "\10\uffff\1\117\13\uffff\1\36\1\34\1\43\1\131\1\44\4\uffff\1\107"+
        "\15\uffff\1\147\2\uffff\1\124\20\uffff\1\24\2\uffff\1\115\1\uffff"+
        "\1\73\1\120\2\uffff\1\22\1\23\12\uffff\1\145\5\uffff\1\144\3\uffff"+
        "\1\135\22\uffff\1\121\3\uffff\1\110\2\uffff\1\114\7\uffff\1\142"+
        "\1\143\2\uffff\1\71\13\uffff\1\65\5\uffff\1\14\1\66\7\uffff\1\126"+
        "\1\116\4\uffff\1\141\1\uffff\1\4\1\uffff\1\122\1\5\4\uffff\1\74"+
        "\1\12\2\uffff\1\70\1\111\3\uffff\1\16\4\uffff\1\63\1\uffff\1\123"+
        "\5\uffff\1\6\1\uffff\1\10\4\uffff\1\113\1\125\2\uffff\1\62\4\uffff"+
        "\1\140\3\uffff\1\11\1\15\1\uffff\1\13\1\17\1\25\3\uffff\1\137\1"+
        "\uffff\1\21\1\7\1\uffff\1\64\4\uffff\1\72\1\136\3\uffff\1\20\1\uffff"+
        "\1\146\1\uffff";
    static final String DFA37_specialS =
        "\1\0\u019a\uffff}>";
    static final String[] DFA37_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\22\1\64\1\37\1\63\1\21\1"+
            "\3\1\57\1\33\1\34\1\17\1\15\1\35\1\16\1\25\1\20\1\60\11\61\1"+
            "\43\1\31\1\24\1\1\1\23\1\26\1\32\1\55\1\47\3\63\1\51\1\52\13"+
            "\63\1\50\1\54\2\63\1\53\3\63\1\40\1\66\1\36\1\62\1\56\1\66\1"+
            "\6\1\63\1\44\1\10\1\27\1\11\2\63\1\30\4\63\1\12\1\14\1\5\1\63"+
            "\1\46\1\7\1\4\1\63\1\13\1\45\3\63\1\41\1\2\1\42\uff82\66",
            "\1\67\1\70",
            "\1\72",
            "\1\74",
            "\1\76\11\uffff\1\77\6\uffff\1\100",
            "\1\104\20\uffff\1\103\2\uffff\1\102",
            "\1\105\20\uffff\1\106",
            "\1\112\13\uffff\1\107\1\111\1\uffff\1\113\1\uffff\1\110",
            "\1\115\3\uffff\1\114\5\uffff\1\116",
            "\1\120\7\uffff\1\117\5\uffff\1\121",
            "\1\122\3\uffff\1\124\11\uffff\1\123\5\uffff\1\125",
            "\1\127\15\uffff\1\126",
            "\1\130",
            "\1\132\21\uffff\1\131",
            "\1\136\17\uffff\1\134\1\135",
            "\1\141\22\uffff\1\140",
            "\1\144\4\uffff\1\145\15\uffff\1\143",
            "\1\147",
            "\1\151",
            "\1\153",
            "\1\155",
            "\1\157",
            "\1\162\13\uffff\1\161",
            "\1\165\13\uffff\1\164",
            "\1\170\6\uffff\1\166\1\167",
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
            "\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\23\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\u0094\10\uffff\1\u0096\1\uffff\3\u0096\5\uffff\1\u0096"+
            "\13\uffff\1\u0093\6\uffff\1\u0094\2\uffff\1\u0096\1\uffff\3"+
            "\u0096\5\uffff\1\u0096\13\uffff\1\u0093",
            "\12\u0094\10\uffff\1\u0096\1\uffff\3\u0096\5\uffff\1\u0096"+
            "\22\uffff\1\u0094\2\uffff\1\u0096\1\uffff\3\u0096\5\uffff\1"+
            "\u0096",
            "\1\101\34\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "",
            "",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b\23\uffff\1\u009d\3\uffff\1\u009c",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0\5\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\22\101\1\u00a4\7\101",
            "\1\u00a6\20\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\5\uffff\1\u00b8",
            "\1\u00b9",
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
            "",
            "",
            "",
            "\1\u00ba",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bd\15\uffff\1\u00bc",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
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
            "\1\u00c4\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\12\u0094\10\uffff\1\u0096\1\uffff\3\u0096\5\uffff\1\u0096"+
            "\22\uffff\1\u0094\2\uffff\1\u0096\1\uffff\3\u0096\5\uffff\1"+
            "\u0096",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\1\u00e4\31\101",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u00e9",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u00ec",
            "\1\u00ed",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u00f0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0118",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u011c",
            "\1\u011d",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\22\101\1\u0129\7\101",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\13\101\1\u013b\16\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141\16\uffff\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "",
            "\1\u014c",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "",
            "\1\u014e",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0164",
            "",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "",
            "\1\u0169",
            "",
            "\1\u016a",
            "",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u016c",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u016e",
            "",
            "",
            "\1\u016f",
            "\1\u0170",
            "",
            "",
            "\1\u0171",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "",
            "\1\u0174",
            "\1\u0175",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0177",
            "",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b\26\uffff\1\u017b\31\uffff\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0181",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "",
            "",
            "\1\u018c",
            "",
            "",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "",
            "",
            "\1\u0191",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "",
            "",
            "\1\u0196",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff"+
            "\32\101",
            "\1\u0198",
            "",
            "\1\101\13\uffff\12\101\7\uffff\32\101\4\uffff\1\u019a\1\uffff"+
            "\32\101",
            "",
            "\1\u0090"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_BUT_TEXT | RULE_TEXT | RULE_RICH_TEXT | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                        s = -1;
                        if ( (LA37_0=='=') ) {s = 1;}

                        else if ( (LA37_0=='|') ) {s = 2;}

                        else if ( (LA37_0=='&') ) {s = 3;}

                        else if ( (LA37_0=='t') ) {s = 4;}

                        else if ( (LA37_0=='p') ) {s = 5;}

                        else if ( (LA37_0=='a') ) {s = 6;}

                        else if ( (LA37_0=='s') ) {s = 7;}

                        else if ( (LA37_0=='d') ) {s = 8;}

                        else if ( (LA37_0=='f') ) {s = 9;}

                        else if ( (LA37_0=='n') ) {s = 10;}

                        else if ( (LA37_0=='v') ) {s = 11;}

                        else if ( (LA37_0=='o') ) {s = 12;}

                        else if ( (LA37_0=='+') ) {s = 13;}

                        else if ( (LA37_0=='-') ) {s = 14;}

                        else if ( (LA37_0=='*') ) {s = 15;}

                        else if ( (LA37_0=='/') ) {s = 16;}

                        else if ( (LA37_0=='%') ) {s = 17;}

                        else if ( (LA37_0=='!') ) {s = 18;}

                        else if ( (LA37_0=='>') ) {s = 19;}

                        else if ( (LA37_0=='<') ) {s = 20;}

                        else if ( (LA37_0=='.') ) {s = 21;}

                        else if ( (LA37_0=='?') ) {s = 22;}

                        else if ( (LA37_0=='e') ) {s = 23;}

                        else if ( (LA37_0=='i') ) {s = 24;}

                        else if ( (LA37_0==';') ) {s = 25;}

                        else if ( (LA37_0=='@') ) {s = 26;}

                        else if ( (LA37_0=='(') ) {s = 27;}

                        else if ( (LA37_0==')') ) {s = 28;}

                        else if ( (LA37_0==',') ) {s = 29;}

                        else if ( (LA37_0==']') ) {s = 30;}

                        else if ( (LA37_0=='#') ) {s = 31;}

                        else if ( (LA37_0=='[') ) {s = 32;}

                        else if ( (LA37_0=='{') ) {s = 33;}

                        else if ( (LA37_0=='}') ) {s = 34;}

                        else if ( (LA37_0==':') ) {s = 35;}

                        else if ( (LA37_0=='c') ) {s = 36;}

                        else if ( (LA37_0=='w') ) {s = 37;}

                        else if ( (LA37_0=='r') ) {s = 38;}

                        else if ( (LA37_0=='B') ) {s = 39;}

                        else if ( (LA37_0=='S') ) {s = 40;}

                        else if ( (LA37_0=='F') ) {s = 41;}

                        else if ( (LA37_0=='G') ) {s = 42;}

                        else if ( (LA37_0=='W') ) {s = 43;}

                        else if ( (LA37_0=='T') ) {s = 44;}

                        else if ( (LA37_0=='A') ) {s = 45;}

                        else if ( (LA37_0=='_') ) {s = 46;}

                        else if ( (LA37_0=='\'') ) {s = 47;}

                        else if ( (LA37_0=='0') ) {s = 48;}

                        else if ( ((LA37_0>='1' && LA37_0<='9')) ) {s = 49;}

                        else if ( (LA37_0=='^') ) {s = 50;}

                        else if ( (LA37_0=='$'||(LA37_0>='C' && LA37_0<='E')||(LA37_0>='H' && LA37_0<='R')||(LA37_0>='U' && LA37_0<='V')||(LA37_0>='X' && LA37_0<='Z')||LA37_0=='b'||(LA37_0>='g' && LA37_0<='h')||(LA37_0>='j' && LA37_0<='m')||LA37_0=='q'||LA37_0=='u'||(LA37_0>='x' && LA37_0<='z')) ) {s = 51;}

                        else if ( (LA37_0=='\"') ) {s = 52;}

                        else if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {s = 53;}

                        else if ( ((LA37_0>='\u0000' && LA37_0<='\b')||(LA37_0>='\u000B' && LA37_0<='\f')||(LA37_0>='\u000E' && LA37_0<='\u001F')||LA37_0=='\\'||LA37_0=='`'||(LA37_0>='~' && LA37_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}