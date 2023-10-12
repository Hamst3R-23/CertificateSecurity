package project.spring.security.model;

public class Certificate {

    private String fingerprint;

    private String fingerprintAlgorithm;

    private String subject;


    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFingerprintAlgorithm() {
        return fingerprintAlgorithm;
    }

    public void setFingerprintAlgorithm(String fingerprintAlgorithm) {
        this.fingerprintAlgorithm = fingerprintAlgorithm;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
