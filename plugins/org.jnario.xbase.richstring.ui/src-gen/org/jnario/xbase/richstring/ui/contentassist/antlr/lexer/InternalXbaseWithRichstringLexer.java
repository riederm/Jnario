package org.jnario.xbase.richstring.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXbaseWithRichstringLexer extends Lexer {
    public static final int Val=30;
    public static final int LessThanSignGreaterThanSign=45;
    public static final int RULE_HEX=84;
    public static final int Import=10;
    public static final int EqualsSignGreaterThanSign=47;
    public static final int Var=31;
    public static final int False=16;
    public static final int LessThanSign=69;
    public static final int LeftParenthesis=59;
    public static final int Throw=18;
    public static final int Extends=8;
    public static final int ExclamationMark=55;
    public static final int ExclamationMarkEqualsSignEqualsSign=24;
    public static final int GreaterThanSign=71;
    public static final int RULE_ID=87;
    public static final int RULE_RICH_TEXT_START=81;
    public static final int GreaterThanSignEqualsSign=48;
    public static final int ColonColon=44;
    public static final int EqualsSignEqualsSign=46;
    public static final int Switch=13;
    public static final int VerticalLine=77;
    public static final int PlusSign=62;
    public static final int RULE_INT=85;
    public static final int RULE_ML_COMMENT=89;
    public static final int LeftSquareBracket=74;
    public static final int If=53;
    public static final int Finally=9;
    public static final int Catch=15;
    public static final int VerticalLineVerticalLine=54;
    public static final int Case=20;
    public static final int QuestionMarkFullStop=49;
    public static final int Comma=63;
    public static final int As=51;
    public static final int HyphenMinus=64;
    public static final int Synchronized=4;
    public static final int QuestionMarkColon=50;
    public static final int Solidus=66;
    public static final int RightCurlyBracket=78;
    public static final int PercentSignEqualsSign=33;
    public static final int FullStop=65;
    public static final int Default=7;
    public static final int CommercialAt=73;
    public static final int Semicolon=68;
    public static final int PlusSignPlusSign=37;
    public static final int QuestionMark=72;
    public static final int Else=21;
    public static final int ExclamationMarkEqualsSign=32;
    public static final int HyphenMinusGreaterThanSign=41;
    public static final int HyphenMinusHyphenMinus=39;
    public static final int New=28;
    public static final int Null=22;
    public static final int Typeof=14;
    public static final int SolidusEqualsSign=43;
    public static final int True=23;
    public static final int PercentSign=57;
    public static final int Super=17;
    public static final int FullStopFullStop=42;
    public static final int Try=29;
    public static final int Ampersand=58;
    public static final int AsteriskEqualsSign=36;
    public static final int RightSquareBracket=75;
    public static final int For=27;
    public static final int RightParenthesis=60;
    public static final int Do=52;
    public static final int EqualsSignEqualsSignEqualsSign=26;
    public static final int RULE_DECIMAL=86;
    public static final int NumberSign=56;
    public static final int AsteriskAsterisk=35;
    public static final int Static=12;
    public static final int RULE_STRING=88;
    public static final int RULE_SL_COMMENT=90;
    public static final int RULE_IN_RICH_STRING=79;
    public static final int EqualsSign=70;
    public static final int AmpersandAmpersand=34;
    public static final int Instanceof=5;
    public static final int HyphenMinusEqualsSign=40;
    public static final int Colon=67;
    public static final int EOF=-1;
    public static final int Asterisk=61;
    public static final int PlusSignEqualsSign=38;
    public static final int RULE_RICH_TEXT=80;
    public static final int Return=11;
    public static final int RULE_WS=91;
    public static final int RULE_RICH_TEXT_END=82;
    public static final int LeftCurlyBracket=76;
    public static final int While=19;
    public static final int RULE_ANY_OTHER=92;
    public static final int RULE_RICH_TEXT_INBETWEEN=83;
    public static final int Extension=6;
    public static final int FullStopFullStopLessThanSign=25;

    // delegates
    // delegators

    public InternalXbaseWithRichstringLexer() {;} 
    public InternalXbaseWithRichstringLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXbaseWithRichstringLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXbaseWithRichstringLexer.g"; }

    // $ANTLR start "Synchronized"
    public final void mSynchronized() throws RecognitionException {
        try {
            int _type = Synchronized;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:19:14: ( 'synchronized' )
            // InternalXbaseWithRichstringLexer.g:19:16: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Synchronized"

    // $ANTLR start "Instanceof"
    public final void mInstanceof() throws RecognitionException {
        try {
            int _type = Instanceof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:21:12: ( 'instanceof' )
            // InternalXbaseWithRichstringLexer.g:21:14: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Instanceof"

    // $ANTLR start "Extension"
    public final void mExtension() throws RecognitionException {
        try {
            int _type = Extension;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:23:11: ( 'extension' )
            // InternalXbaseWithRichstringLexer.g:23:13: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extension"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:25:9: ( 'default' )
            // InternalXbaseWithRichstringLexer.g:25:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:27:9: ( 'extends' )
            // InternalXbaseWithRichstringLexer.g:27:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Finally"
    public final void mFinally() throws RecognitionException {
        try {
            int _type = Finally;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:29:9: ( 'finally' )
            // InternalXbaseWithRichstringLexer.g:29:11: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Finally"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:31:8: ( 'import' )
            // InternalXbaseWithRichstringLexer.g:31:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:33:8: ( 'return' )
            // InternalXbaseWithRichstringLexer.g:33:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Static"
    public final void mStatic() throws RecognitionException {
        try {
            int _type = Static;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:35:8: ( 'static' )
            // InternalXbaseWithRichstringLexer.g:35:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Static"

    // $ANTLR start "Switch"
    public final void mSwitch() throws RecognitionException {
        try {
            int _type = Switch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:37:8: ( 'switch' )
            // InternalXbaseWithRichstringLexer.g:37:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Switch"

    // $ANTLR start "Typeof"
    public final void mTypeof() throws RecognitionException {
        try {
            int _type = Typeof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:39:8: ( 'typeof' )
            // InternalXbaseWithRichstringLexer.g:39:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Typeof"

    // $ANTLR start "Catch"
    public final void mCatch() throws RecognitionException {
        try {
            int _type = Catch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:41:7: ( 'catch' )
            // InternalXbaseWithRichstringLexer.g:41:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Catch"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:43:7: ( 'false' )
            // InternalXbaseWithRichstringLexer.g:43:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Super"
    public final void mSuper() throws RecognitionException {
        try {
            int _type = Super;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:45:7: ( 'super' )
            // InternalXbaseWithRichstringLexer.g:45:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Super"

    // $ANTLR start "Throw"
    public final void mThrow() throws RecognitionException {
        try {
            int _type = Throw;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:47:7: ( 'throw' )
            // InternalXbaseWithRichstringLexer.g:47:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Throw"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:49:7: ( 'while' )
            // InternalXbaseWithRichstringLexer.g:49:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:51:6: ( 'case' )
            // InternalXbaseWithRichstringLexer.g:51:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:53:6: ( 'else' )
            // InternalXbaseWithRichstringLexer.g:53:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:55:6: ( 'null' )
            // InternalXbaseWithRichstringLexer.g:55:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:57:6: ( 'true' )
            // InternalXbaseWithRichstringLexer.g:57:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "ExclamationMarkEqualsSignEqualsSign"
    public final void mExclamationMarkEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:59:37: ( '!==' )
            // InternalXbaseWithRichstringLexer.g:59:39: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSignEqualsSign"

    // $ANTLR start "FullStopFullStopLessThanSign"
    public final void mFullStopFullStopLessThanSign() throws RecognitionException {
        try {
            int _type = FullStopFullStopLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:61:30: ( '..<' )
            // InternalXbaseWithRichstringLexer.g:61:32: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStopLessThanSign"

    // $ANTLR start "EqualsSignEqualsSignEqualsSign"
    public final void mEqualsSignEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:63:32: ( '===' )
            // InternalXbaseWithRichstringLexer.g:63:34: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSignEqualsSign"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:65:5: ( 'for' )
            // InternalXbaseWithRichstringLexer.g:65:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:67:5: ( 'new' )
            // InternalXbaseWithRichstringLexer.g:67:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "Try"
    public final void mTry() throws RecognitionException {
        try {
            int _type = Try;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:69:5: ( 'try' )
            // InternalXbaseWithRichstringLexer.g:69:7: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Try"

    // $ANTLR start "Val"
    public final void mVal() throws RecognitionException {
        try {
            int _type = Val;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:71:5: ( 'val' )
            // InternalXbaseWithRichstringLexer.g:71:7: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Val"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:73:5: ( 'var' )
            // InternalXbaseWithRichstringLexer.g:73:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:75:27: ( '!=' )
            // InternalXbaseWithRichstringLexer.g:75:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "PercentSignEqualsSign"
    public final void mPercentSignEqualsSign() throws RecognitionException {
        try {
            int _type = PercentSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:77:23: ( '%=' )
            // InternalXbaseWithRichstringLexer.g:77:25: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSignEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:79:20: ( '&&' )
            // InternalXbaseWithRichstringLexer.g:79:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:81:18: ( '**' )
            // InternalXbaseWithRichstringLexer.g:81:20: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "AsteriskEqualsSign"
    public final void mAsteriskEqualsSign() throws RecognitionException {
        try {
            int _type = AsteriskEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:83:20: ( '*=' )
            // InternalXbaseWithRichstringLexer.g:83:22: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskEqualsSign"

    // $ANTLR start "PlusSignPlusSign"
    public final void mPlusSignPlusSign() throws RecognitionException {
        try {
            int _type = PlusSignPlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:85:18: ( '++' )
            // InternalXbaseWithRichstringLexer.g:85:20: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignPlusSign"

    // $ANTLR start "PlusSignEqualsSign"
    public final void mPlusSignEqualsSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:87:20: ( '+=' )
            // InternalXbaseWithRichstringLexer.g:87:22: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSign"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:89:24: ( '--' )
            // InternalXbaseWithRichstringLexer.g:89:26: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "HyphenMinusEqualsSign"
    public final void mHyphenMinusEqualsSign() throws RecognitionException {
        try {
            int _type = HyphenMinusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:91:23: ( '-=' )
            // InternalXbaseWithRichstringLexer.g:91:25: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusEqualsSign"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:93:28: ( '->' )
            // InternalXbaseWithRichstringLexer.g:93:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:95:18: ( '..' )
            // InternalXbaseWithRichstringLexer.g:95:20: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "SolidusEqualsSign"
    public final void mSolidusEqualsSign() throws RecognitionException {
        try {
            int _type = SolidusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:97:19: ( '/=' )
            // InternalXbaseWithRichstringLexer.g:97:21: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SolidusEqualsSign"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:99:12: ( '::' )
            // InternalXbaseWithRichstringLexer.g:99:14: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:101:29: ( '<>' )
            // InternalXbaseWithRichstringLexer.g:101:31: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:103:22: ( '==' )
            // InternalXbaseWithRichstringLexer.g:103:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:105:27: ( '=>' )
            // InternalXbaseWithRichstringLexer.g:105:29: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:107:27: ( '>=' )
            // InternalXbaseWithRichstringLexer.g:107:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "QuestionMarkFullStop"
    public final void mQuestionMarkFullStop() throws RecognitionException {
        try {
            int _type = QuestionMarkFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:109:22: ( '?.' )
            // InternalXbaseWithRichstringLexer.g:109:24: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMarkFullStop"

    // $ANTLR start "QuestionMarkColon"
    public final void mQuestionMarkColon() throws RecognitionException {
        try {
            int _type = QuestionMarkColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:111:19: ( '?:' )
            // InternalXbaseWithRichstringLexer.g:111:21: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMarkColon"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:113:4: ( 'as' )
            // InternalXbaseWithRichstringLexer.g:113:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:115:4: ( 'do' )
            // InternalXbaseWithRichstringLexer.g:115:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:117:4: ( 'if' )
            // InternalXbaseWithRichstringLexer.g:117:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:119:26: ( '||' )
            // InternalXbaseWithRichstringLexer.g:119:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:121:17: ( '!' )
            // InternalXbaseWithRichstringLexer.g:121:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:123:12: ( '#' )
            // InternalXbaseWithRichstringLexer.g:123:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:125:13: ( '%' )
            // InternalXbaseWithRichstringLexer.g:125:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:127:11: ( '&' )
            // InternalXbaseWithRichstringLexer.g:127:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:129:17: ( '(' )
            // InternalXbaseWithRichstringLexer.g:129:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:131:18: ( ')' )
            // InternalXbaseWithRichstringLexer.g:131:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:133:10: ( '*' )
            // InternalXbaseWithRichstringLexer.g:133:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:135:10: ( '+' )
            // InternalXbaseWithRichstringLexer.g:135:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:137:7: ( ',' )
            // InternalXbaseWithRichstringLexer.g:137:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:139:13: ( '-' )
            // InternalXbaseWithRichstringLexer.g:139:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:141:10: ( '.' )
            // InternalXbaseWithRichstringLexer.g:141:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:143:9: ( '/' )
            // InternalXbaseWithRichstringLexer.g:143:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:145:7: ( ':' )
            // InternalXbaseWithRichstringLexer.g:145:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:147:11: ( ';' )
            // InternalXbaseWithRichstringLexer.g:147:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:149:14: ( '<' )
            // InternalXbaseWithRichstringLexer.g:149:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:151:12: ( '=' )
            // InternalXbaseWithRichstringLexer.g:151:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:153:17: ( '>' )
            // InternalXbaseWithRichstringLexer.g:153:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:155:14: ( '?' )
            // InternalXbaseWithRichstringLexer.g:155:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:157:14: ( '@' )
            // InternalXbaseWithRichstringLexer.g:157:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:159:19: ( '[' )
            // InternalXbaseWithRichstringLexer.g:159:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:161:20: ( ']' )
            // InternalXbaseWithRichstringLexer.g:161:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:163:18: ( '{' )
            // InternalXbaseWithRichstringLexer.g:163:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:165:14: ( '|' )
            // InternalXbaseWithRichstringLexer.g:165:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:167:19: ( '}' )
            // InternalXbaseWithRichstringLexer.g:167:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXbaseWithRichstringLexer.g:171:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // InternalXbaseWithRichstringLexer.g:171:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // InternalXbaseWithRichstringLexer.g:171:27: ( RULE_IN_RICH_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='&')||(LA1_4>='(' && LA1_4<='\u00AA')||(LA1_4>='\u00AC' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\u00AA')||(LA1_1>='\u00AC' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\u00AA')||(LA1_0>='\u00AC' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:171:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXbaseWithRichstringLexer.g:171:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\'') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='\'') ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                }
                else {
                    alt4=2;}
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:171:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // InternalXbaseWithRichstringLexer.g:171:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // InternalXbaseWithRichstringLexer.g:171:58: ( '\\'' ( '\\'' )? )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\'') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:171:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // InternalXbaseWithRichstringLexer.g:171:64: ( '\\'' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='\'') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalXbaseWithRichstringLexer.g:171:64: '\\''
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
            // InternalXbaseWithRichstringLexer.g:173:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // InternalXbaseWithRichstringLexer.g:173:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // InternalXbaseWithRichstringLexer.g:173:33: ( RULE_IN_RICH_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='&')||(LA5_4>='(' && LA5_4<='\u00AA')||(LA5_4>='\u00AC' && LA5_4<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='&')||(LA5_1>='(' && LA5_1<='\u00AA')||(LA5_1>='\u00AC' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\u00AA')||(LA5_0>='\u00AC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:173:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalXbaseWithRichstringLexer.g:173:54: ( '\\'' ( '\\'' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\'') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:173:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // InternalXbaseWithRichstringLexer.g:173:60: ( '\\'' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:173:60: '\\''
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
            // InternalXbaseWithRichstringLexer.g:175:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // InternalXbaseWithRichstringLexer.g:175:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // InternalXbaseWithRichstringLexer.g:175:31: ( RULE_IN_RICH_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        int LA8_4 = input.LA(3);

                        if ( ((LA8_4>='\u0000' && LA8_4<='&')||(LA8_4>='(' && LA8_4<='\u00AA')||(LA8_4>='\u00AC' && LA8_4<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='&')||(LA8_1>='(' && LA8_1<='\u00AA')||(LA8_1>='\u00AC' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\u00AA')||(LA8_0>='\u00AC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:175:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalXbaseWithRichstringLexer.g:175:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='\'') ) {
                        alt11=1;
                    }
                    else {
                        alt11=2;}
                }
                else {
                    alt11=2;}
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:175:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // InternalXbaseWithRichstringLexer.g:175:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // InternalXbaseWithRichstringLexer.g:175:62: ( '\\'' ( '\\'' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\'') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:175:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // InternalXbaseWithRichstringLexer.g:175:68: ( '\\'' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='\'') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // InternalXbaseWithRichstringLexer.g:175:68: '\\''
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
            // InternalXbaseWithRichstringLexer.g:177:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // InternalXbaseWithRichstringLexer.g:177:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // InternalXbaseWithRichstringLexer.g:177:37: ( RULE_IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\u00AA')||(LA12_4>='\u00AC' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\u00AA')||(LA12_1>='\u00AC' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:177:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalXbaseWithRichstringLexer.g:177:58: ( '\\'' ( '\\'' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:177:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // InternalXbaseWithRichstringLexer.g:177:64: ( '\\'' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:177:64: '\\''
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

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // InternalXbaseWithRichstringLexer.g:179:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // InternalXbaseWithRichstringLexer.g:179:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // InternalXbaseWithRichstringLexer.g:179:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='\'') ) {
                    alt15=1;
                }
                else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\u00AA')||(LA15_1>='\u00AC' && LA15_1<='\uFFFF')) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFF')) ) {
                alt15=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:179:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
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
                    // InternalXbaseWithRichstringLexer.g:179:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
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
                    // InternalXbaseWithRichstringLexer.g:179:83: ~ ( ( '\\u00AB' | '\\'' ) )
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
            // InternalXbaseWithRichstringLexer.g:181:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalXbaseWithRichstringLexer.g:181:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalXbaseWithRichstringLexer.g:181:12: ( '0x' | '0X' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='0') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='x') ) {
                    alt16=1;
                }
                else if ( (LA16_1=='X') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:181:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalXbaseWithRichstringLexer.g:181:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalXbaseWithRichstringLexer.g:181:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='F')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='f')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalXbaseWithRichstringLexer.g:181:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='#') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:181:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalXbaseWithRichstringLexer.g:181:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='B'||LA18_0=='b') ) {
                        alt18=1;
                    }
                    else if ( (LA18_0=='L'||LA18_0=='l') ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:181:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // InternalXbaseWithRichstringLexer.g:181:84: ( 'l' | 'L' )
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
            // InternalXbaseWithRichstringLexer.g:183:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalXbaseWithRichstringLexer.g:183:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalXbaseWithRichstringLexer.g:183:21: ( '0' .. '9' | '_' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||LA20_0=='_') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:
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
            	    break loop20;
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
            // InternalXbaseWithRichstringLexer.g:185:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalXbaseWithRichstringLexer.g:185:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalXbaseWithRichstringLexer.g:185:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='E'||LA22_0=='e') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:185:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalXbaseWithRichstringLexer.g:185:36: ( '+' | '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='+'||LA21_0=='-') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:
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

            // InternalXbaseWithRichstringLexer.g:185:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='B'||LA23_0=='b') ) {
                alt23=1;
            }
            else if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='L'||LA23_0=='d'||LA23_0=='f'||LA23_0=='l') ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:185:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // InternalXbaseWithRichstringLexer.g:185:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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
            // InternalXbaseWithRichstringLexer.g:187:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalXbaseWithRichstringLexer.g:187:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalXbaseWithRichstringLexer.g:187:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:187:11: '^'
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

            // InternalXbaseWithRichstringLexer.g:187:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='$'||(LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:
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
            	    break loop25;
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
            // InternalXbaseWithRichstringLexer.g:189:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalXbaseWithRichstringLexer.g:189:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalXbaseWithRichstringLexer.g:189:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\"') ) {
                alt30=1;
            }
            else if ( (LA30_0=='\'') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:189:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalXbaseWithRichstringLexer.g:189:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalXbaseWithRichstringLexer.g:189:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXbaseWithRichstringLexer.g:189:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop26;
                        }
                    } while (true);

                    // InternalXbaseWithRichstringLexer.g:189:44: ( '\"' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\"') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:189:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalXbaseWithRichstringLexer.g:189:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalXbaseWithRichstringLexer.g:189:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXbaseWithRichstringLexer.g:189:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXbaseWithRichstringLexer.g:189:62: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop28;
                        }
                    } while (true);

                    // InternalXbaseWithRichstringLexer.g:189:79: ( '\\'' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\'') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:189:79: '\\''
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
            // InternalXbaseWithRichstringLexer.g:191:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXbaseWithRichstringLexer.g:191:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXbaseWithRichstringLexer.g:191:24: ( options {greedy=false; } : . )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='*') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='/') ) {
                        alt31=2;
                    }
                    else if ( ((LA31_1>='\u0000' && LA31_1<='.')||(LA31_1>='0' && LA31_1<='\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0>='\u0000' && LA31_0<=')')||(LA31_0>='+' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:191:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // InternalXbaseWithRichstringLexer.g:193:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXbaseWithRichstringLexer.g:193:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXbaseWithRichstringLexer.g:193:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:193:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop32;
                }
            } while (true);

            // InternalXbaseWithRichstringLexer.g:193:40: ( ( '\\r' )? '\\n' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXbaseWithRichstringLexer.g:193:41: ( '\\r' )? '\\n'
                    {
                    // InternalXbaseWithRichstringLexer.g:193:41: ( '\\r' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\r') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalXbaseWithRichstringLexer.g:193:41: '\\r'
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
            // InternalXbaseWithRichstringLexer.g:195:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXbaseWithRichstringLexer.g:195:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXbaseWithRichstringLexer.g:195:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXbaseWithRichstringLexer.g:
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
            // InternalXbaseWithRichstringLexer.g:197:16: ( . )
            // InternalXbaseWithRichstringLexer.g:197:18: .
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
        // InternalXbaseWithRichstringLexer.g:1:8: ( Synchronized | Instanceof | Extension | Default | Extends | Finally | Import | Return | Static | Switch | Typeof | Catch | False | Super | Throw | While | Case | Else | Null | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | For | New | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt36=88;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // InternalXbaseWithRichstringLexer.g:1:10: Synchronized
                {
                mSynchronized(); 

                }
                break;
            case 2 :
                // InternalXbaseWithRichstringLexer.g:1:23: Instanceof
                {
                mInstanceof(); 

                }
                break;
            case 3 :
                // InternalXbaseWithRichstringLexer.g:1:34: Extension
                {
                mExtension(); 

                }
                break;
            case 4 :
                // InternalXbaseWithRichstringLexer.g:1:44: Default
                {
                mDefault(); 

                }
                break;
            case 5 :
                // InternalXbaseWithRichstringLexer.g:1:52: Extends
                {
                mExtends(); 

                }
                break;
            case 6 :
                // InternalXbaseWithRichstringLexer.g:1:60: Finally
                {
                mFinally(); 

                }
                break;
            case 7 :
                // InternalXbaseWithRichstringLexer.g:1:68: Import
                {
                mImport(); 

                }
                break;
            case 8 :
                // InternalXbaseWithRichstringLexer.g:1:75: Return
                {
                mReturn(); 

                }
                break;
            case 9 :
                // InternalXbaseWithRichstringLexer.g:1:82: Static
                {
                mStatic(); 

                }
                break;
            case 10 :
                // InternalXbaseWithRichstringLexer.g:1:89: Switch
                {
                mSwitch(); 

                }
                break;
            case 11 :
                // InternalXbaseWithRichstringLexer.g:1:96: Typeof
                {
                mTypeof(); 

                }
                break;
            case 12 :
                // InternalXbaseWithRichstringLexer.g:1:103: Catch
                {
                mCatch(); 

                }
                break;
            case 13 :
                // InternalXbaseWithRichstringLexer.g:1:109: False
                {
                mFalse(); 

                }
                break;
            case 14 :
                // InternalXbaseWithRichstringLexer.g:1:115: Super
                {
                mSuper(); 

                }
                break;
            case 15 :
                // InternalXbaseWithRichstringLexer.g:1:121: Throw
                {
                mThrow(); 

                }
                break;
            case 16 :
                // InternalXbaseWithRichstringLexer.g:1:127: While
                {
                mWhile(); 

                }
                break;
            case 17 :
                // InternalXbaseWithRichstringLexer.g:1:133: Case
                {
                mCase(); 

                }
                break;
            case 18 :
                // InternalXbaseWithRichstringLexer.g:1:138: Else
                {
                mElse(); 

                }
                break;
            case 19 :
                // InternalXbaseWithRichstringLexer.g:1:143: Null
                {
                mNull(); 

                }
                break;
            case 20 :
                // InternalXbaseWithRichstringLexer.g:1:148: True
                {
                mTrue(); 

                }
                break;
            case 21 :
                // InternalXbaseWithRichstringLexer.g:1:153: ExclamationMarkEqualsSignEqualsSign
                {
                mExclamationMarkEqualsSignEqualsSign(); 

                }
                break;
            case 22 :
                // InternalXbaseWithRichstringLexer.g:1:189: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 23 :
                // InternalXbaseWithRichstringLexer.g:1:218: EqualsSignEqualsSignEqualsSign
                {
                mEqualsSignEqualsSignEqualsSign(); 

                }
                break;
            case 24 :
                // InternalXbaseWithRichstringLexer.g:1:249: For
                {
                mFor(); 

                }
                break;
            case 25 :
                // InternalXbaseWithRichstringLexer.g:1:253: New
                {
                mNew(); 

                }
                break;
            case 26 :
                // InternalXbaseWithRichstringLexer.g:1:257: Try
                {
                mTry(); 

                }
                break;
            case 27 :
                // InternalXbaseWithRichstringLexer.g:1:261: Val
                {
                mVal(); 

                }
                break;
            case 28 :
                // InternalXbaseWithRichstringLexer.g:1:265: Var
                {
                mVar(); 

                }
                break;
            case 29 :
                // InternalXbaseWithRichstringLexer.g:1:269: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 30 :
                // InternalXbaseWithRichstringLexer.g:1:295: PercentSignEqualsSign
                {
                mPercentSignEqualsSign(); 

                }
                break;
            case 31 :
                // InternalXbaseWithRichstringLexer.g:1:317: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 32 :
                // InternalXbaseWithRichstringLexer.g:1:336: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 33 :
                // InternalXbaseWithRichstringLexer.g:1:353: AsteriskEqualsSign
                {
                mAsteriskEqualsSign(); 

                }
                break;
            case 34 :
                // InternalXbaseWithRichstringLexer.g:1:372: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 35 :
                // InternalXbaseWithRichstringLexer.g:1:389: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 36 :
                // InternalXbaseWithRichstringLexer.g:1:408: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 37 :
                // InternalXbaseWithRichstringLexer.g:1:431: HyphenMinusEqualsSign
                {
                mHyphenMinusEqualsSign(); 

                }
                break;
            case 38 :
                // InternalXbaseWithRichstringLexer.g:1:453: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 39 :
                // InternalXbaseWithRichstringLexer.g:1:480: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 40 :
                // InternalXbaseWithRichstringLexer.g:1:497: SolidusEqualsSign
                {
                mSolidusEqualsSign(); 

                }
                break;
            case 41 :
                // InternalXbaseWithRichstringLexer.g:1:515: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 42 :
                // InternalXbaseWithRichstringLexer.g:1:526: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalXbaseWithRichstringLexer.g:1:554: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 44 :
                // InternalXbaseWithRichstringLexer.g:1:575: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 45 :
                // InternalXbaseWithRichstringLexer.g:1:601: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 46 :
                // InternalXbaseWithRichstringLexer.g:1:627: QuestionMarkFullStop
                {
                mQuestionMarkFullStop(); 

                }
                break;
            case 47 :
                // InternalXbaseWithRichstringLexer.g:1:648: QuestionMarkColon
                {
                mQuestionMarkColon(); 

                }
                break;
            case 48 :
                // InternalXbaseWithRichstringLexer.g:1:666: As
                {
                mAs(); 

                }
                break;
            case 49 :
                // InternalXbaseWithRichstringLexer.g:1:669: Do
                {
                mDo(); 

                }
                break;
            case 50 :
                // InternalXbaseWithRichstringLexer.g:1:672: If
                {
                mIf(); 

                }
                break;
            case 51 :
                // InternalXbaseWithRichstringLexer.g:1:675: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 52 :
                // InternalXbaseWithRichstringLexer.g:1:700: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 53 :
                // InternalXbaseWithRichstringLexer.g:1:716: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 54 :
                // InternalXbaseWithRichstringLexer.g:1:727: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 55 :
                // InternalXbaseWithRichstringLexer.g:1:739: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 56 :
                // InternalXbaseWithRichstringLexer.g:1:749: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 57 :
                // InternalXbaseWithRichstringLexer.g:1:765: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 58 :
                // InternalXbaseWithRichstringLexer.g:1:782: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 59 :
                // InternalXbaseWithRichstringLexer.g:1:791: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 60 :
                // InternalXbaseWithRichstringLexer.g:1:800: Comma
                {
                mComma(); 

                }
                break;
            case 61 :
                // InternalXbaseWithRichstringLexer.g:1:806: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 62 :
                // InternalXbaseWithRichstringLexer.g:1:818: FullStop
                {
                mFullStop(); 

                }
                break;
            case 63 :
                // InternalXbaseWithRichstringLexer.g:1:827: Solidus
                {
                mSolidus(); 

                }
                break;
            case 64 :
                // InternalXbaseWithRichstringLexer.g:1:835: Colon
                {
                mColon(); 

                }
                break;
            case 65 :
                // InternalXbaseWithRichstringLexer.g:1:841: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 66 :
                // InternalXbaseWithRichstringLexer.g:1:851: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 67 :
                // InternalXbaseWithRichstringLexer.g:1:864: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 68 :
                // InternalXbaseWithRichstringLexer.g:1:875: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 69 :
                // InternalXbaseWithRichstringLexer.g:1:891: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 70 :
                // InternalXbaseWithRichstringLexer.g:1:904: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 71 :
                // InternalXbaseWithRichstringLexer.g:1:917: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 72 :
                // InternalXbaseWithRichstringLexer.g:1:935: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 73 :
                // InternalXbaseWithRichstringLexer.g:1:954: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 74 :
                // InternalXbaseWithRichstringLexer.g:1:971: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 75 :
                // InternalXbaseWithRichstringLexer.g:1:984: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 76 :
                // InternalXbaseWithRichstringLexer.g:1:1002: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 77 :
                // InternalXbaseWithRichstringLexer.g:1:1017: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 78 :
                // InternalXbaseWithRichstringLexer.g:1:1038: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 79 :
                // InternalXbaseWithRichstringLexer.g:1:1057: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 80 :
                // InternalXbaseWithRichstringLexer.g:1:1082: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 81 :
                // InternalXbaseWithRichstringLexer.g:1:1091: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 82 :
                // InternalXbaseWithRichstringLexer.g:1:1100: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 83 :
                // InternalXbaseWithRichstringLexer.g:1:1113: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 84 :
                // InternalXbaseWithRichstringLexer.g:1:1121: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 85 :
                // InternalXbaseWithRichstringLexer.g:1:1133: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 86 :
                // InternalXbaseWithRichstringLexer.g:1:1149: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 87 :
                // InternalXbaseWithRichstringLexer.g:1:1165: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 88 :
                // InternalXbaseWithRichstringLexer.g:1:1173: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA36_eotS =
        "\1\uffff\12\62\1\106\1\110\1\113\1\62\1\116\1\120\1\123\1\126\1\132\1\136\1\140\1\142\1\144\1\147\1\62\1\152\12\uffff\1\166\1\167\2\174\1\55\4\uffff\4\62\1\uffff\2\62\1\u0086\3\62\1\u008a\13\62\1\u0099\1\uffff\1\u009b\1\uffff\1\u009d\2\uffff\1\62\33\uffff\1\u00a0\14\uffff\1\166\2\uffff\2\167\3\uffff\1\174\2\uffff\6\62\1\uffff\3\62\1\uffff\2\62\1\u00af\4\62\1\u00b4\4\62\1\u00b9\6\uffff\1\u00ba\1\u00bb\1\uffff\1\u00bf\2\167\7\62\1\u00c8\3\62\1\uffff\3\62\1\u00cf\1\uffff\1\62\1\u00d1\1\62\1\u00d3\3\uffff\2\u00bf\2\uffff\1\167\3\62\1\u00d9\3\62\1\uffff\2\62\1\u00e0\2\62\1\u00e3\1\uffff\1\u00e4\1\uffff\1\u00e5\1\uffff\2\u00bf\1\62\1\u00e8\1\u00e9\1\uffff\1\62\1\u00eb\4\62\1\uffff\1\u00f0\1\u00f1\3\uffff\1\u00bf\1\62\2\uffff\1\62\1\uffff\1\62\1\u00f5\1\u00f6\1\u00f7\2\uffff\3\62\3\uffff\2\62\1\u00fd\1\62\1\u00ff\1\uffff\1\62\1\uffff\1\u0101\1\uffff";
    static final String DFA36_eofS =
        "\u0102\uffff";
    static final String DFA36_minS =
        "\1\0\1\164\1\146\1\154\1\145\1\141\1\145\1\150\1\141\1\150\1\145\1\75\1\56\1\75\1\141\1\75\1\46\1\52\1\53\1\55\1\52\1\72\1\76\1\75\1\56\1\163\1\174\12\uffff\1\47\1\0\2\60\1\44\4\uffff\1\156\1\141\1\151\1\160\1\uffff\1\163\1\160\1\44\1\164\1\163\1\146\1\44\1\156\1\154\1\162\1\164\1\160\1\162\1\165\1\163\1\151\1\154\1\167\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\154\33\uffff\1\44\14\uffff\1\47\2\uffff\2\0\3\uffff\1\60\2\uffff\1\143\2\164\1\145\1\164\1\157\1\uffff\2\145\1\141\1\uffff\1\141\1\163\1\44\1\165\1\145\1\157\1\145\1\44\1\143\1\145\2\154\1\44\6\uffff\2\44\1\uffff\3\0\1\150\1\151\1\143\1\162\1\141\1\162\1\156\1\44\1\165\1\154\1\145\1\uffff\1\162\1\157\1\167\1\44\1\uffff\1\150\1\44\1\145\1\44\3\uffff\2\0\2\uffff\1\0\1\162\1\143\1\150\1\44\1\156\1\164\1\144\1\uffff\2\154\1\44\1\156\1\146\1\44\1\uffff\1\44\1\uffff\1\44\1\uffff\2\0\1\157\2\44\1\uffff\1\143\1\44\1\151\1\163\1\164\1\171\1\uffff\2\44\3\uffff\1\0\1\156\2\uffff\1\145\1\uffff\1\157\3\44\2\uffff\1\151\1\157\1\156\3\uffff\1\172\1\146\1\44\1\145\1\44\1\uffff\1\144\1\uffff\1\44\1\uffff";
    static final String DFA36_maxS =
        "\1\uffff\1\171\1\156\1\170\2\157\1\145\1\171\1\141\1\150\1\165\1\75\1\56\1\76\1\141\1\75\1\46\2\75\1\76\1\75\1\72\1\76\1\75\1\72\1\163\1\174\12\uffff\1\47\1\uffff\1\170\1\154\1\172\4\uffff\1\156\1\141\1\151\1\160\1\uffff\1\163\1\160\1\172\1\164\1\163\1\146\1\172\1\156\1\154\1\162\1\164\1\160\1\162\1\171\1\164\1\151\1\154\1\167\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\162\33\uffff\1\172\14\uffff\1\47\2\uffff\2\uffff\3\uffff\1\154\2\uffff\1\143\2\164\1\145\1\164\1\157\1\uffff\2\145\1\141\1\uffff\1\141\1\163\1\172\1\165\1\145\1\157\1\145\1\172\1\143\1\145\2\154\1\172\6\uffff\2\172\1\uffff\3\uffff\1\150\1\151\1\143\1\162\1\141\1\162\1\156\1\172\1\165\1\154\1\145\1\uffff\1\162\1\157\1\167\1\172\1\uffff\1\150\1\172\1\145\1\172\3\uffff\2\uffff\2\uffff\1\uffff\1\162\1\143\1\150\1\172\1\156\1\164\1\163\1\uffff\2\154\1\172\1\156\1\146\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\uffff\1\157\2\172\1\uffff\1\143\1\172\1\151\1\163\1\164\1\171\1\uffff\2\172\3\uffff\1\uffff\1\156\2\uffff\1\145\1\uffff\1\157\3\172\2\uffff\1\151\1\157\1\156\3\uffff\1\172\1\146\1\172\1\145\1\172\1\uffff\1\144\1\uffff\1\172\1\uffff";
    static final String DFA36_acceptS =
        "\33\uffff\1\65\1\70\1\71\1\74\1\101\1\106\1\107\1\110\1\111\1\113\5\uffff\1\123\1\124\1\127\1\130\4\uffff\1\123\23\uffff\1\64\1\uffff\1\76\1\uffff\1\54\1\103\1\uffff\1\36\1\66\1\37\1\67\1\40\1\41\1\72\1\42\1\43\1\73\1\44\1\45\1\46\1\75\1\50\1\125\1\126\1\77\1\51\1\100\1\52\1\102\1\55\1\104\1\56\1\57\1\105\1\uffff\1\63\1\112\1\65\1\70\1\71\1\74\1\101\1\106\1\107\1\110\1\111\1\113\1\uffff\1\124\1\116\2\uffff\1\117\1\120\1\121\1\uffff\1\122\1\127\6\uffff\1\62\3\uffff\1\61\15\uffff\1\25\1\35\1\26\1\47\1\27\1\53\2\uffff\1\60\16\uffff\1\30\4\uffff\1\32\4\uffff\1\31\1\33\1\34\2\uffff\1\115\1\114\10\uffff\1\22\6\uffff\1\24\1\uffff\1\21\1\uffff\1\23\5\uffff\1\16\6\uffff\1\15\2\uffff\1\17\1\14\1\20\2\uffff\1\11\1\12\1\uffff\1\7\4\uffff\1\10\1\13\3\uffff\1\5\1\4\1\6\5\uffff\1\3\1\uffff\1\2\1\uffff\1\1";
    static final String DFA36_specialS =
        "\1\14\45\uffff\1\3\121\uffff\1\1\1\11\47\uffff\1\13\1\0\1\10\30\uffff\1\12\1\6\2\uffff\1\7\23\uffff\1\2\1\5\20\uffff\1\4\33\uffff}>";
    static final String[] DFA36_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\13\1\53\1\33\1\52\1\17\1\20\1\45\1\34\1\35\1\21\1\22\1\36\1\23\1\14\1\24\1\47\11\50\1\25\1\37\1\26\1\15\1\27\1\30\1\40\32\52\1\41\1\55\1\42\1\51\1\52\1\55\1\31\1\52\1\10\1\4\1\3\1\5\2\52\1\2\4\52\1\12\3\52\1\6\1\1\1\7\1\52\1\16\1\11\3\52\1\43\1\32\1\44\75\55\1\46\uff44\55",
            "\1\57\1\61\1\uffff\1\60\1\uffff\1\56",
            "\1\65\6\uffff\1\64\1\63",
            "\1\67\13\uffff\1\66",
            "\1\70\11\uffff\1\71",
            "\1\73\7\uffff\1\72\5\uffff\1\74",
            "\1\75",
            "\1\77\11\uffff\1\100\6\uffff\1\76",
            "\1\101",
            "\1\102",
            "\1\104\17\uffff\1\103",
            "\1\105",
            "\1\107",
            "\1\111\1\112",
            "\1\114",
            "\1\115",
            "\1\117",
            "\1\121\22\uffff\1\122",
            "\1\124\21\uffff\1\125",
            "\1\127\17\uffff\1\130\1\131",
            "\1\134\4\uffff\1\135\15\uffff\1\133",
            "\1\137",
            "\1\141",
            "\1\143",
            "\1\145\13\uffff\1\146",
            "\1\150",
            "\1\151",
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
            "\1\165",
            "\47\171\1\170\u0083\171\1\172\uff54\171",
            "\12\175\10\uffff\1\176\1\uffff\3\176\5\uffff\1\176\13\uffff\1\173\6\uffff\1\175\2\uffff\1\176\1\uffff\3\176\5\uffff\1\176\13\uffff\1\173",
            "\12\175\10\uffff\1\176\1\uffff\3\176\5\uffff\1\176\22\uffff\1\175\2\uffff\1\176\1\uffff\3\176\5\uffff\1\176",
            "\1\62\34\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0094\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u009a",
            "",
            "\1\u009c",
            "",
            "",
            "\1\u009e\5\uffff\1\u009f",
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
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
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
            "\1\u00a1",
            "",
            "",
            "\47\u00a3\1\u00a2\u0083\u00a3\1\172\uff54\u00a3",
            "\47\171\1\170\u0083\171\1\172\uff54\171",
            "",
            "",
            "",
            "\12\175\10\uffff\1\176\1\uffff\3\176\5\uffff\1\176\22\uffff\1\175\2\uffff\1\176\1\uffff\3\176\5\uffff\1\176",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\47\u00bd\1\u00bc\u0083\u00bd\1\u00be\uff54\u00bd",
            "\47\u00c0\1\uffff\u0083\u00c0\1\172\uff54\u00c0",
            "\47\171\1\170\u0083\171\1\172\uff54\171",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00d0",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00d2",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\47\u00d5\1\u00d4\u0083\u00d5\1\u00be\uff54\u00d5",
            "\47\u00bd\1\u00bc\u0083\u00bd\1\u00be\uff54\u00bd",
            "",
            "",
            "\47\171\1\170\u0083\171\1\172\uff54\171",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dd\16\uffff\1\u00dc",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00e1",
            "\1\u00e2",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\47\u00e6\1\uffff\u0083\u00e6\1\u00be\uff54\u00e6",
            "\47\u00bd\1\u00bc\u0083\u00bd\1\u00be\uff54\u00bd",
            "\1\u00e7",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00ea",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\47\u00bd\1\u00bc\u0083\u00bd\1\u00be\uff54\u00bd",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00fe",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0100",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    static class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Synchronized | Instanceof | Extension | Default | Extends | Finally | Import | Return | Static | Switch | Typeof | Catch | False | Super | Throw | While | Case | Else | Null | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | For | New | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_162 = input.LA(1);

                        s = -1;
                        if ( ((LA36_162>='\u0000' && LA36_162<='&')||(LA36_162>='(' && LA36_162<='\u00AA')||(LA36_162>='\u00AC' && LA36_162<='\uFFFF')) ) {s = 192;}

                        else if ( (LA36_162=='\u00AB') ) {s = 122;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_120 = input.LA(1);

                        s = -1;
                        if ( (LA36_120=='\'') ) {s = 162;}

                        else if ( ((LA36_120>='\u0000' && LA36_120<='&')||(LA36_120>='(' && LA36_120<='\u00AA')||(LA36_120>='\u00AC' && LA36_120<='\uFFFF')) ) {s = 163;}

                        else if ( (LA36_120=='\u00AB') ) {s = 122;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_212 = input.LA(1);

                        s = -1;
                        if ( ((LA36_212>='\u0000' && LA36_212<='&')||(LA36_212>='(' && LA36_212<='\u00AA')||(LA36_212>='\u00AC' && LA36_212<='\uFFFF')) ) {s = 230;}

                        else if ( (LA36_212=='\u00AB') ) {s = 190;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_38 = input.LA(1);

                        s = -1;
                        if ( (LA36_38=='\'') ) {s = 120;}

                        else if ( ((LA36_38>='\u0000' && LA36_38<='&')||(LA36_38>='(' && LA36_38<='\u00AA')||(LA36_38>='\u00AC' && LA36_38<='\uFFFF')) ) {s = 121;}

                        else if ( (LA36_38=='\u00AB') ) {s = 122;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_230 = input.LA(1);

                        s = -1;
                        if ( (LA36_230=='\'') ) {s = 188;}

                        else if ( (LA36_230=='\u00AB') ) {s = 190;}

                        else if ( ((LA36_230>='\u0000' && LA36_230<='&')||(LA36_230>='(' && LA36_230<='\u00AA')||(LA36_230>='\u00AC' && LA36_230<='\uFFFF')) ) {s = 189;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_213 = input.LA(1);

                        s = -1;
                        if ( (LA36_213=='\'') ) {s = 188;}

                        else if ( (LA36_213=='\u00AB') ) {s = 190;}

                        else if ( ((LA36_213>='\u0000' && LA36_213<='&')||(LA36_213>='(' && LA36_213<='\u00AA')||(LA36_213>='\u00AC' && LA36_213<='\uFFFF')) ) {s = 189;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_189 = input.LA(1);

                        s = -1;
                        if ( (LA36_189=='\'') ) {s = 188;}

                        else if ( (LA36_189=='\u00AB') ) {s = 190;}

                        else if ( ((LA36_189>='\u0000' && LA36_189<='&')||(LA36_189>='(' && LA36_189<='\u00AA')||(LA36_189>='\u00AC' && LA36_189<='\uFFFF')) ) {s = 189;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_192 = input.LA(1);

                        s = -1;
                        if ( (LA36_192=='\'') ) {s = 120;}

                        else if ( (LA36_192=='\u00AB') ) {s = 122;}

                        else if ( ((LA36_192>='\u0000' && LA36_192<='&')||(LA36_192>='(' && LA36_192<='\u00AA')||(LA36_192>='\u00AC' && LA36_192<='\uFFFF')) ) {s = 121;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_163 = input.LA(1);

                        s = -1;
                        if ( (LA36_163=='\'') ) {s = 120;}

                        else if ( (LA36_163=='\u00AB') ) {s = 122;}

                        else if ( ((LA36_163>='\u0000' && LA36_163<='&')||(LA36_163>='(' && LA36_163<='\u00AA')||(LA36_163>='\u00AC' && LA36_163<='\uFFFF')) ) {s = 121;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_121 = input.LA(1);

                        s = -1;
                        if ( (LA36_121=='\'') ) {s = 120;}

                        else if ( (LA36_121=='\u00AB') ) {s = 122;}

                        else if ( ((LA36_121>='\u0000' && LA36_121<='&')||(LA36_121>='(' && LA36_121<='\u00AA')||(LA36_121>='\u00AC' && LA36_121<='\uFFFF')) ) {s = 121;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_188 = input.LA(1);

                        s = -1;
                        if ( (LA36_188=='\'') ) {s = 212;}

                        else if ( ((LA36_188>='\u0000' && LA36_188<='&')||(LA36_188>='(' && LA36_188<='\u00AA')||(LA36_188>='\u00AC' && LA36_188<='\uFFFF')) ) {s = 213;}

                        else if ( (LA36_188=='\u00AB') ) {s = 190;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_161 = input.LA(1);

                        s = -1;
                        if ( (LA36_161=='\'') ) {s = 188;}

                        else if ( ((LA36_161>='\u0000' && LA36_161<='&')||(LA36_161>='(' && LA36_161<='\u00AA')||(LA36_161>='\u00AC' && LA36_161<='\uFFFF')) ) {s = 189;}

                        else if ( (LA36_161=='\u00AB') ) {s = 190;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_0 = input.LA(1);

                        s = -1;
                        if ( (LA36_0=='s') ) {s = 1;}

                        else if ( (LA36_0=='i') ) {s = 2;}

                        else if ( (LA36_0=='e') ) {s = 3;}

                        else if ( (LA36_0=='d') ) {s = 4;}

                        else if ( (LA36_0=='f') ) {s = 5;}

                        else if ( (LA36_0=='r') ) {s = 6;}

                        else if ( (LA36_0=='t') ) {s = 7;}

                        else if ( (LA36_0=='c') ) {s = 8;}

                        else if ( (LA36_0=='w') ) {s = 9;}

                        else if ( (LA36_0=='n') ) {s = 10;}

                        else if ( (LA36_0=='!') ) {s = 11;}

                        else if ( (LA36_0=='.') ) {s = 12;}

                        else if ( (LA36_0=='=') ) {s = 13;}

                        else if ( (LA36_0=='v') ) {s = 14;}

                        else if ( (LA36_0=='%') ) {s = 15;}

                        else if ( (LA36_0=='&') ) {s = 16;}

                        else if ( (LA36_0=='*') ) {s = 17;}

                        else if ( (LA36_0=='+') ) {s = 18;}

                        else if ( (LA36_0=='-') ) {s = 19;}

                        else if ( (LA36_0=='/') ) {s = 20;}

                        else if ( (LA36_0==':') ) {s = 21;}

                        else if ( (LA36_0=='<') ) {s = 22;}

                        else if ( (LA36_0=='>') ) {s = 23;}

                        else if ( (LA36_0=='?') ) {s = 24;}

                        else if ( (LA36_0=='a') ) {s = 25;}

                        else if ( (LA36_0=='|') ) {s = 26;}

                        else if ( (LA36_0=='#') ) {s = 27;}

                        else if ( (LA36_0=='(') ) {s = 28;}

                        else if ( (LA36_0==')') ) {s = 29;}

                        else if ( (LA36_0==',') ) {s = 30;}

                        else if ( (LA36_0==';') ) {s = 31;}

                        else if ( (LA36_0=='@') ) {s = 32;}

                        else if ( (LA36_0=='[') ) {s = 33;}

                        else if ( (LA36_0==']') ) {s = 34;}

                        else if ( (LA36_0=='{') ) {s = 35;}

                        else if ( (LA36_0=='}') ) {s = 36;}

                        else if ( (LA36_0=='\'') ) {s = 37;}

                        else if ( (LA36_0=='\u00BB') ) {s = 38;}

                        else if ( (LA36_0=='0') ) {s = 39;}

                        else if ( ((LA36_0>='1' && LA36_0<='9')) ) {s = 40;}

                        else if ( (LA36_0=='^') ) {s = 41;}

                        else if ( (LA36_0=='$'||(LA36_0>='A' && LA36_0<='Z')||LA36_0=='_'||LA36_0=='b'||(LA36_0>='g' && LA36_0<='h')||(LA36_0>='j' && LA36_0<='m')||(LA36_0>='o' && LA36_0<='q')||LA36_0=='u'||(LA36_0>='x' && LA36_0<='z')) ) {s = 42;}

                        else if ( (LA36_0=='\"') ) {s = 43;}

                        else if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {s = 44;}

                        else if ( ((LA36_0>='\u0000' && LA36_0<='\b')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\u001F')||LA36_0=='\\'||LA36_0=='`'||(LA36_0>='~' && LA36_0<='\u00BA')||(LA36_0>='\u00BC' && LA36_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}