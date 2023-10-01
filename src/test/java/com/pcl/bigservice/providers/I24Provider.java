package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I24Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i25Provider;
    @Hard
    private final Provider<Integer> i26Provider;
    @Hard
    private final Provider<Integer> i28Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i41Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i48Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i51Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i57Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i69Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		
        try {
            Thread.sleep(58);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b4Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b18Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b22Provider.get(request);
		int p11Val = b28Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b33Provider.get(request);
		int p14Val = b36Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b39Provider.get(request);
		int p17Val = b42Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = b50Provider.get(request);
		int p22Val = i25Provider.get(request);
		int p23Val = i26Provider.get(request);
		int p24Val = i28Provider.get(request);
		int p25Val = i30Provider.get(request);
		int p26Val = i31Provider.get(request);
		int p27Val = i36Provider.get(request);
		int p28Val = i37Provider.get(request);
		int p29Val = i39Provider.get(request);
		int p30Val = i41Provider.get(request);
		int p31Val = i42Provider.get(request);
		int p32Val = i44Provider.get(request);
		int p33Val = i46Provider.get(request);
		int p34Val = i48Provider.get(request);
		int p35Val = i49Provider.get(request);
		int p36Val = i51Provider.get(request);
		int p37Val = i52Provider.get(request);
		int p38Val = i57Provider.get(request);
		int p39Val = i59Provider.get(request);
		int p40Val = i65Provider.get(request);
		int p41Val = i67Provider.get(request);
		int p42Val = i69Provider.get(request);
		int p43Val = i70Provider.get(request);
		int p44Val = i71Provider.get(request);
		int p45Val = i72Provider.get(request);
		int p46Val = i73Provider.get(request);
		int p47Val = i75Provider.get(request);
		int p48Val = i76Provider.get(request);
		int p49Val = i77Provider.get(request);
		int p50Val = i79Provider.get(request);
		int p51Val = i80Provider.get(request);
		int p52Val = i81Provider.get(request);
		int p53Val = i82Provider.get(request);
		int p54Val = i85Provider.get(request);
		int p55Val = i94Provider.get(request);
		int p56Val = i96Provider.get(request);
		int p57Val = i98Provider.get(request);
		int p58Val = i100Provider.get(request);
		int p59Val = i103Provider.get(request);
		int p60Val = i105Provider.get(request);
		int p61Val = i106Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p62Val = i108Provider.get(request);
		int p63Val = i109Provider.get(request);
		int p64Val = i112Provider.get(request);
		int p65Val = i114Provider.get(request);
		int p66Val = i115Provider.get(request);
		int p67Val = i118Provider.get(request);
		int p68Val = i119Provider.get(request);
		int p69Val = i122Provider.get(request);
		int p70Val = i123Provider.get(request);
		int p71Val = i124Provider.get(request);
		int p72Val = i125Provider.get(request);
		int p73Val = i128Provider.get(request);
		
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p74Val = i130Provider.get(request);
		int p75Val = i133Provider.get(request);
		int p76Val = i136Provider.get(request);
		int p77Val = i137Provider.get(request);
		int p78Val = i140Provider.get(request);
		int p79Val = i143Provider.get(request);
		int p80Val = i149Provider.get(request);
		int p81Val = i150Provider.get(request);
		int p82Val = i151Provider.get(request);
		int p83Val = i152Provider.get(request);
		int p84Val = i153Provider.get(request);
		int p85Val = i156Provider.get(request);
		int p86Val = i159Provider.get(request);
		int p87Val = i160Provider.get(request);
		int p88Val = i162Provider.get(request);
		int p89Val = i166Provider.get(request);
		int p90Val = i168Provider.get(request);
		int p91Val = i169Provider.get(request);
		int p92Val = i171Provider.get(request);
		int p93Val = i172Provider.get(request);
		int p94Val = i179Provider.get(request);
		int p95Val = i182Provider.get(request);
		int p96Val = i184Provider.get(request);
		int p97Val = i186Provider.get(request);
		int p98Val = i188Provider.get(request);
		int p99Val = i189Provider.get(request);
		int p100Val = i190Provider.get(request);
		int p101Val = i192Provider.get(request);
		int p102Val = i194Provider.get(request);
		int p103Val = i197Provider.get(request);
		int p104Val = i199Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val +
				p81Val +
				p82Val +
				p83Val +
				p84Val +
				p85Val +
				p86Val +
				p87Val +
				p88Val +
				p89Val +
				p90Val +
				p91Val +
				p92Val +
				p93Val +
				p94Val +
				p95Val +
				p96Val +
				p97Val +
				p98Val +
				p99Val +
				p100Val +
				p101Val +
				p102Val +
				p103Val +
				p104Val;
    }
}
