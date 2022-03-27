//package utility;
//
//import jdk.internal.org.xml.sax.ErrorHandler;
//import jdk.internal.org.xml.sax.SAXException;
//import jdk.internal.org.xml.sax.SAXParseException;
//
//import java.io.PrintWriter;
//
//public class MyErrorHandler implements ErrorHandler, org.xml.sax.ErrorHandler {
//
//    private PrintWriter out;
//
//    MyErrorHandler(PrintWriter out) {
//        this.out = out;
//    }
//
//    private String getParseExceptionInfo(SAXParseException spe) {
//        String systemId = spe.getSystemId();
//        if (systemId == null) {
//            systemId = "null";
//        }
//
//        String info = "URI=" + systemId + " Line=" + spe.getLineNumber() +
//                ": " + spe.getMessage();
//        return info;
//    }
//
//    public void warning(SAXParseException spe) throws SAXException {
//        out.println("Warning: " + getParseExceptionInfo(spe));
//    }
//
//    public void error(SAXParseException spe) throws SAXException {
//        String message = "Error: " + getParseExceptionInfo(spe);
//        throw new SAXException(message);
//    }
//
//    public void fatalError(SAXParseException spe) throws SAXException {
//        String message = "Fatal Error: " + getParseExceptionInfo(spe);
//        throw new SAXException(message);
//    }
//
//    @Override
//    public void warning(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
//
//    }
//
//    @Override
//    public void error(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
//
//    }
//
//    @Override
//    public void fatalError(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
//
//    }
//}
